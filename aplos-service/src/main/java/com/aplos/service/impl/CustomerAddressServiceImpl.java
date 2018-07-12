package com.aplos.service.impl;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.CustomerAddressService;
import com.aplos.service.bl.CustomerAddressServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 14/05/2018.
 */
@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerAddressServiceImpl.class);

    @Autowired
    CustomerAddressServiceBL customerAddressServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addCustomerAddress(CustomerAddressDto customerAddressDto) {
        LOGGER.info("CustomerAddressServiceImpl.addCustomerAddress(customerAddressDto) execution started.");
        ResponseDto responseDto = null;
        try {
            CustomerAddressDto customerAddressDtoResult = customerAddressServiceBL.addCustomerAddress(customerAddressDto);
            if (customerAddressDtoResult != null) {
                LOGGER.info("CustomerAddress SavedFor saved for customerId [{}]", customerAddressDto.getCustomerId().getCustomerId());
                responseDto = serviceUtil.getServiceResponse(customerAddressDtoResult);
            } else {
                LOGGER.info("Unable to Save CustomerAddress");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CUSTOMER_ADDRESS);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Client Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CUSTOMER__ADDRESS);
        }
        return responseDto;
    }

    public ResponseDto getCustomerAddressCountByCityId(Long cityId) {
        LOGGER.info("CustomerAddressServiceImpl.getCustomerAddressCountByCityId(cityId) execution started.");
        ResponseDto responseDto = null;
        try {
            Integer count = customerAddressServiceBL.getCustomerAddressCountByCityId(cityId);
            if (count != null) {
                LOGGER.info("CustomerAddress count for cityId [{}]", cityId);
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("Unable to Retrieve CustomerAddress count for city id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CUSTOMER_ADDRESS_COUNT_FOR_CITY_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customer address count for city");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CUSTOMER_ADDRESS_COUNT_FOR_CITY_ID);
        }
        return responseDto;
    }

    public ResponseDto getCustomerAddressByCityId(Long cityId) {
        LOGGER.info("CustomerAddressServiceImpl.getCustomerAddressCountByCityId(cityId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<CustomerAddressDto> customerAddressDtosResult = customerAddressServiceBL.getCustomerAddressByCityId(cityId);
            if (customerAddressDtosResult != null) {
                LOGGER.info("CustomerAddress recieved for cityId [{}]", cityId);
                responseDto = serviceUtil.getServiceResponse(customerAddressDtosResult);
            } else {
                LOGGER.info("Unable to Retrieve CustomerAddress for city id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CUSTOMER_ADDRESS_FOR_CITY_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customer address for city if Client Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CUSTOMER_ADDRESS_FOR_CITY_ID);
        }
        return responseDto;
    }
}
