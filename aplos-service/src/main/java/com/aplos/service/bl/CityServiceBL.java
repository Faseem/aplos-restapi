package com.aplos.service.bl;

import com.aplos.common.dto.CityDto;
import com.aplos.common.dto.ClientCityDto;
import com.aplos.dao.CityDoa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class CityServiceBL {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceBL.class);

    @Autowired
    CityDoa cityDoa;


    public List<CityDto> getAllCity(){
        LOGGER.info("CityServiceBL.getAllCity() execution started.");
        return cityDoa.getAllCity();
    }

    public CityDto getCityByName(String cityName){
        LOGGER.info("CityServiceBL.getCityByName(cityName) execution started.");
        return cityDoa.getCityByName(cityName);
    }

    public List<CityDto> getAllCityByClientId(Long clientId){
        LOGGER.info("CityServiceBL.getAllCityByClientId(clientId) execution started.");
        return cityDoa.getAllCityByClientId(clientId);
    }

    public CityDto getCityByNameByClient(String cityName, Long clientId){
        LOGGER.info("CityServiceBL.getCityByNameByClient(cityName, clientId) execution started.");
        return cityDoa.getCityByNameByClient(cityName, clientId);
    }
}
