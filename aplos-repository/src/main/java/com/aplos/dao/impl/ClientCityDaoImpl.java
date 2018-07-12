package com.aplos.dao.impl;

import com.aplos.common.dto.ClientCityDto;
import com.aplos.dao.ClientCityDao;
import com.aplos.domain.ClientCity;
import com.aplos.transformer.ClientCityTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Repository
public class ClientCityDaoImpl  extends BaseDaoImpl<ClientCity>  implements ClientCityDao {

    @Autowired
    ClientCityTransformer clientCityTransformer;

    @Override
    public ClientCityDto addClientCity(ClientCityDto clientCityDto) {
        ClientCity clientCity = clientCityTransformer.reverseTransform(clientCityDto);
        ClientCity clientCityResult = saveOrUpdate(clientCity);
        ClientCityDto ClientCityDtoResult = clientCityTransformer.transform(clientCityResult);
        return ClientCityDtoResult;
    }

    @Override
    public List<ClientCityDto> getAllCityByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCity.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        List<ClientCityDto> clientCityDtos = new ArrayList<>();
        for (ClientCity clientCity : (ArrayList<ClientCity>)criteria.list()) {
            clientCityDtos.add(clientCityTransformer.transform(clientCity));
        }
        return  clientCityDtos;
    }

    @Override
    public ClientCityDto getCityByNameByClient(String cityName, Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCity.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.createAlias("cityId", "cityId");
        criteria.add(Restrictions.eq("cityId.cityName", cityName));
        criteria.setMaxResults(1);
        return clientCityTransformer.transform(((ClientCity) criteria.uniqueResult()));
    }


}
