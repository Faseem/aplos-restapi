package com.aplos.dao;

import com.aplos.common.dto.CityDto;
import com.aplos.domain.City;

import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */
public interface CityDoa extends  BaseDao<City> {
    public List<CityDto> getAllCity();
    public CityDto getCityByName(String cityName);
    public List<CityDto> getAllCityByClientId(Long clientId);
    public CityDto getCityByNameByClient(String cityName, Long clientId);
}
