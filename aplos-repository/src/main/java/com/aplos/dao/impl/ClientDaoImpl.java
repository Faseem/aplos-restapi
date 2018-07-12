package com.aplos.dao.impl;

import com.aplos.common.dto.ClientDto;
import com.aplos.dao.ClientDao;
import com.aplos.domain.Client;
import com.aplos.transformer.ClientTrasformenr;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Aux072 on 06/06/2018.
 */

@Repository
public class ClientDaoImpl extends BaseDaoImpl<Client> implements ClientDao {

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Override
    public ClientDto getClientByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(Client.class);
        criteria.add(Restrictions.eq("clientId", clientId));
        return clientTrasformenr.transform((Client) criteria.uniqueResult());
    }
}
