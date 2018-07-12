package com.aplos.dao.impl;

import com.aplos.common.dto.ClientDto;
import com.aplos.common.dto.PrivilageDto;
import com.aplos.common.dto.UserDto;
import com.aplos.dao.UserDao;
import com.aplos.domain.*;
import com.aplos.transformer.ClientRolePrivilageTransformer;
import com.aplos.transformer.ClientTrasformenr;
import com.aplos.transformer.PrivilageTransformer;
import com.aplos.transformer.UserTransformer;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 18/04/2018.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    ClientRolePrivilageTransformer clientRolePrivilageTransformer;

    @Autowired
    PrivilageTransformer privilageTransformer;

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Transactional
    public User getUserByUsername(String username) {
        Criteria criteria = getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("username", username));
        criteria.setMaxResults(1);
        return  (User) criteria.uniqueResult();
    }

    @Transactional
    public List<PrivilageDto> getPrevilagesByUserId(Long userId) {

        Criteria criteria = getCurrentSession().createCriteria(UserClientRole.class);
        criteria.createAlias("userId", "userId");
        criteria.add(Restrictions.eq("userId.userId", userId));
        List<PrivilageDto> privilegeDtos = new ArrayList<>();

        for (UserClientRole userClientRole : (ArrayList<UserClientRole>)criteria.list()) {
            for(ClientRolePrivilage clientRolePrivilage: userClientRole.getClientRoleId().getClientRolePrivilageList()) {
                privilegeDtos.add(privilageTransformer.transform(clientRolePrivilage.getPrivilageId()));
            }
        }
        return  privilegeDtos;
    }

    @Transactional
    public UserDto validateUser(String username){
        String hql = "FROM User u WHERE CAST( u.username as binary) = CAST(:username as binary) AND u.userIsActive =1 ";
        Query query = getCurrentSession().createQuery(hql).setParameter("username", username);
        User user = (User) query.uniqueResult();
        return userTransformer.transform(user);
    }

    @Transactional
    public ClientDto getUserClient(Long userId){
        Criteria criteria = getCurrentSession().createCriteria(ClientUser.class);
        criteria.createAlias("user", "user");
        criteria.add(Restrictions.eq("user.userId", userId));
        criteria.setMaxResults(1);
        System.out.println(criteria.list().size());
        ClientUser clientUser = (ClientUser) criteria.uniqueResult();
        return clientTrasformenr.transform(clientUser.getClient());
    }

    @Transactional
    public List<UserDto> getAllUsers(Integer startFrom, Integer numberOfRecordNeed, String order){
        Criteria criteria = getCurrentSession().createCriteria(User.class);
        if (numberOfRecordNeed != null) {
            criteria.setMaxResults(numberOfRecordNeed);
        }
        if (startFrom != null) {
            criteria.setFirstResult(startFrom);
        }
        List<UserDto> userDtos = new ArrayList<>();
        for(User  user: (ArrayList<User>)criteria.list()){
            userDtos.add(userTransformer.transform(user));
        }
        return userDtos;
    }

    @Override
    public UserDto getUserByUserId(Long userId) {
        Criteria criteria = getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("userId", userId));
        return userTransformer.transform((User) criteria.uniqueResult());
    }

    @Override
    public List<UserDto> getAllUsersByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientUser.class);
        List<UserDto> userDtos = new ArrayList<>();
        for(ClientUser  clientUser: (ArrayList<ClientUser>)criteria.list()){
            userDtos.add(userTransformer.transform(clientUser.getUser()));
        }
        return userDtos;
    }
}
