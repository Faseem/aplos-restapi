package com.aplos.service.impl;

import com.aplos.common.dto.CityDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.CityService;
import com.aplos.service.bl.CityServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class CityServiceImpl implements CityService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    CityServiceBL cityServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto getAllCity() {
        LOGGER.info("CityServiceImpl.getAllCity() execution started.");
        ResponseDto responseDto = null;
        try {
            List<CityDto> cities = cityServiceBL.getAllCity();
            if (cities != null) {
                LOGGER.info("Cities received");
                responseDto = serviceUtil.getServiceResponse(cities);
            } else {
                LOGGER.info("Unable to receive cities");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CITIES);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive cities");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CITIES);
        }
        return responseDto;
    }

    public ResponseDto getCityByName(String cityName) {
        LOGGER.info("CityServiceImpl.getCityByName(cityName) execution started.");
        ResponseDto responseDto = null;
        try {
            CityDto item = cityServiceBL.getCityByName(cityName);
            if (item != null) {
                LOGGER.info("City received for given cityName [{}]", cityName);
                responseDto = serviceUtil.getServiceResponse(item);
            } else {
                LOGGER.info("Unable to receive city for the given vityName [{}]", cityName);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CITY_FOR_CITY_NAME);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive city for the given cityName [{}]", cityName);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CITY_FOR_CITY_NAME);
        }
        return responseDto;
    }

    public ResponseDto getAllCityByClientId(Long clientId) {
        LOGGER.info("ClientCityServiceImpl.getAllCityByClientId(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<CityDto> cityDtos = cityServiceBL.getAllCityByClientId(clientId);
            if (cityDtos != null) {
                LOGGER.info("Cities received for given clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(cityDtos);
            } else {
                LOGGER.info("Unable to receive cities for the given clientId [{}]", clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CITY_FOR_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive cities for the given clientId [{}]", clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CITY_FOR_CLIENT_ID);
        }
        return responseDto;
    }

    public ResponseDto getCityByNameByClient(String cityName, Long clientId) {
        LOGGER.info("CityServiceImpl.getCityByNameByClient(cityName , clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            CityDto cityDto = cityServiceBL.getCityByNameByClient(cityName, clientId);
            if (cityDto != null) {
                LOGGER.info("City received for given CityName [{}] clientId [{}]", cityName, clientId);
                responseDto = serviceUtil.getServiceResponse(cityDto);
            } else {
                LOGGER.info("Unable to receive city for the given CityName [{}] clientId [{}]", cityName, clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CITY_FOR_CITY_NAME_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive items for the given itemName clientId [{}]", cityName, clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CITY_FOR_CITY_NAME_CLIENT_ID);
        }
        return responseDto;
    }
}
