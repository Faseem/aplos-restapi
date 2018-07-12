package com.aplos.controller;

import com.aplos.common.dto.ClientCityDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientCityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 15/05/2018.
 */
@RestController
@RequestMapping("/clientCity")
public class ClientCityController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientCityController.class);

    @Autowired
    ClientCityService clientCityService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseDto addClientCity(@RequestBody ClientCityDto clientCityDto) {
        LOGGER.info(
                "ClientCityController.addClientCity() invoked.");
        return clientCityService.addClientCity(clientCityDto);
    }

    @RequestMapping(value = "/getAllCityByClientId", method = RequestMethod.GET)
    public ResponseDto getAllCityByClientId(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "ClientCityController.getAllCityByClientId(Long {} ) invoked.",clientId);
        return clientCityService.getAllCityByClientId(clientId);
    }

    @RequestMapping(value = "/getCityByNameByClient", method = RequestMethod.GET)
    public ResponseDto getCityByNameByClient(@RequestParam("city_name") String cityName,
                                             @RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "ClientCityController.getCityByNameByClient(String {}, Long {} ) invoked.",cityName, clientId);
        return clientCityService.getCityByNameByClient(cityName, clientId);
    }

}
