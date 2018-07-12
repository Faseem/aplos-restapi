package com.aplos.controller;

import com.aplos.common.dto.ResponseDto;
import com.aplos.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aux072 on 08/05/2018.
 */
@RestController
@RequestMapping("/city")
public class CityController {

    private final static Logger LOGGER = LoggerFactory.getLogger(BatchItemController.class);

    @Autowired
    CityService cityService;


    @RequestMapping(value = "/getAllCity", method = RequestMethod.GET)
    public ResponseDto getAllCity() {
        LOGGER.info(
                "CityController.getAllCity() invoked.");
        return cityService.getAllCity();
    }

    @RequestMapping(value = "/getCityByName", method = RequestMethod.GET)
    public ResponseDto getItemByName(@RequestParam("city_name") String cityName) {
        LOGGER.info(
                "CityController.getCityByName(String {} ) invoked.",cityName);
        return cityService.getCityByName(cityName);
    }

    @RequestMapping(value = "/getAllCityByClientId", method = RequestMethod.GET)
    public ResponseDto getAllCityByClientId(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "ClientCityController.getAllCityByClientId(Long {} ) invoked.",clientId);
        return cityService.getAllCityByClientId(clientId);
    }

    @RequestMapping(value = "/getCityByNameByClient", method = RequestMethod.GET)
    public ResponseDto getCityByNameByClient(@RequestParam("city_name") String cityName,
                                             @RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "ClientCityController.getCityByNameByClient(String {}, Long {} ) invoked.",cityName, clientId);
        return cityService.getCityByNameByClient(cityName, clientId);
    }
}
