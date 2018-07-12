package com.aplos.dao.impl;

import com.aplos.common.dto.CityDto;
import com.aplos.dao.CityDoa;
import com.aplos.domain.City;
import com.aplos.domain.ClientCity;
import com.aplos.transformer.CityTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Repository
public class CityDoaImpl extends BaseDaoImpl<City> implements CityDoa {

    @Autowired
    CityTransformer cityTransformer;

    @Override
    public List<CityDto> getAllCity() {
        Criteria criteria = getCurrentSession().createCriteria(City.class);
        List<CityDto> citiesDto = new ArrayList<>();
        for (City city : (ArrayList<City>)criteria.list()) {
            citiesDto.add(cityTransformer.transform(city));
        }
        return  citiesDto;
    }

    @Override
    public CityDto getCityByName(String cityName) {
        Criteria criteria = getCurrentSession().createCriteria(City.class);
        criteria.add(Restrictions.eq("cityName",cityName));
        return cityTransformer.transform((City)criteria.uniqueResult());
    }

    @Override
    public List<CityDto> getAllCityByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCity.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        List<CityDto> cityDtos = new ArrayList<>();
        for (ClientCity clientCity : (ArrayList<ClientCity>)criteria.list()) {
            cityDtos.add(cityTransformer.transform(clientCity.getCityId()));
        }
        return  cityDtos;
    }

    @Override
    public CityDto getCityByNameByClient(String cityName, Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCity.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.createAlias("cityId", "cityId");
        criteria.add(Restrictions.eq("cityId.cityName", cityName));
        criteria.setMaxResults(1);
        return cityTransformer.transform(((ClientCity) criteria.uniqueResult()).getCityId());
    }
}
