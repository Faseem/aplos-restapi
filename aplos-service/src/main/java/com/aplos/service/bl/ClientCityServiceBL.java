package com.aplos.service.bl;

import com.aplos.common.dto.ClientCityDto;
import com.aplos.dao.ClientCityDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Service
public class ClientCityServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCityServiceBL.class);

    @Autowired
    ClientCityDao clientCityDao;

    public ClientCityDto addClientCity(ClientCityDto clientCityDto){
        LOGGER.info("ClientCityServiceBL.addClientCity(clientCityDto) execution started.");
        return clientCityDao.addClientCity(clientCityDto);
    }

    public List<ClientCityDto> getAllCityByClientId(Long clientId){
        LOGGER.info("ClientCityServiceBL.getAllCityByClientId(clientId) execution started.");
        return clientCityDao.getAllCityByClientId(clientId);
    }

    public ClientCityDto getCityByNameByClient(String cityName, Long clientId){
        LOGGER.info("ClientCityServiceBL.getCityByNameByClient(cityName, clientId) execution started.");
        return clientCityDao.getCityByNameByClient(cityName, clientId);
    }
}
