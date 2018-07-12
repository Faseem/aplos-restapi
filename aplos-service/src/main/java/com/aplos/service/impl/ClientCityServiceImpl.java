package com.aplos.service.impl;

import com.aplos.common.dto.CityDto;
import com.aplos.common.dto.ClientCityDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.ClientCityService;
import com.aplos.service.bl.ClientCityServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Service
public class ClientCityServiceImpl implements ClientCityService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCityServiceImpl.class);

    @Autowired
    ClientCityServiceBL clientCityServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addClientCity(ClientCityDto clientCityDto) {
        LOGGER.info("ClientCityServiceImpl.addClientCity(clientCityDto) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCityDto clientCityDtoResult = clientCityServiceBL.addClientCity(clientCityDto);
            if (clientCityDtoResult != null) {
                LOGGER.info("Client City saved for clientitemId [{}]", clientCityDtoResult.getClientCityId());
                responseDto = serviceUtil.getServiceResponse(clientCityDtoResult);
            } else {
                LOGGER.info("Unable to Save ClientCity");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_CITY);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving client City");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_CITY);
        }
        return responseDto;
    }

    public ResponseDto getAllCityByClientId(Long clientId) {
        LOGGER.info("ClientCityServiceImpl.getAllCityByClientId(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ClientCityDto> clientCityDtos = clientCityServiceBL.getAllCityByClientId(clientId);
            if (clientCityDtos != null) {
                LOGGER.info("Cities received for given clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(clientCityDtos);
            } else {
                LOGGER.info("Unable to receive cities for the given clientId [{}]", clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_CITY_FOR_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive cities for the given clientId [{}]", clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_CITY_FOR_CLIENT_ID);
        }
        return responseDto;
    }

    public ResponseDto getCityByNameByClient(String cityName, Long clientId) {
        LOGGER.info("ClientCityServiceImpl.getCityByNameByClient(cityName , clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCityDto clientCityDto = clientCityServiceBL.getCityByNameByClient(cityName, clientId);
            if (clientCityDto != null) {
                LOGGER.info("City received for given CityName [{}] clientId [{}]", cityName, clientId);
                responseDto = serviceUtil.getServiceResponse(clientCityDto);
            } else {
                LOGGER.info("Unable to receive city for the given CityName [{}] clientId [{}]", cityName, clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_CITY_FOR_CITY_NAME_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive items for the given itemName clientId [{}]", cityName, clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_CITY_FOR_CITY_NAME_CLIENT_ID);
        }
        return responseDto;
    }
}
