package com.aplos.service.impl;

import com.aplos.common.dto.CustomerBasicInfoDto;
import com.aplos.common.dto.CustomerDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.CustomerService;
import com.aplos.service.bl.CustomerAddressServiceBL;
import com.aplos.service.bl.CustomerServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 28/05/2018.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    CustomerServiceBL customerServiceBL;

    @Autowired
    ServiceUtil serviceUtil;


    public ResponseDto getCustomerCountByCityIdByCityId(Long cityId, Long clientId) {
        LOGGER.info("CustomerServiceImpl.getCustomerAddressCountByCityId(cityId) execution started.");
        ResponseDto responseDto = null;
        try {
            Integer count = customerServiceBL.getCustomerCountByCityIdByCityIdByClientId(cityId, clientId);
            if (count != null) {
                LOGGER.info("CustomerAddress count for cityId [{}]", cityId);
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("Unable to Retrieve CustomerAddress count for city id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CUSTOMER_COUNT_FOR_CITY_ID_CLIENT_ID_CITY_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customer count for city");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CUSTOMER_FOR_CITY_ID_CLIENT_ID);
        }
        return responseDto;
    }

    public ResponseDto getCustomerByCityIdByClientId(Long cityId, Long clientId) {
        LOGGER.info("CustomerServiceImpl.getCustomerByCityId(cityId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<CustomerDto> customerDtosResult = customerServiceBL.getCustomerByCityIdByClientId(cityId, clientId);
            if (customerDtosResult != null) {
                LOGGER.info("Customers recieved for cityId [{}]", cityId);
                responseDto = serviceUtil.getServiceResponse(customerDtosResult);
            } else {
                LOGGER.info("Unable to Retrieve Customers for city id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CUSTOMER_FOR_CITY_ID_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customer for city if Client Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CUSTOMER_COUNT_FOR_CITY_ID_CLIENT_ID_CITY_ID);
        }
        return responseDto;
    }

    public ResponseDto getAllPaginatedCustomersForCityIdClientId(Long cityId, Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("CustomerServiceImpl.getAllPaginatedCustomersForCityIdClientId(cityId, clientId, startFrom, numberOfRecordNeed,) execution started.");
        ResponseDto responseDto = null;
        try {
            List<CustomerDto> customerDtosResult = customerServiceBL.getAllPaginatedCustomersForCityIdClientId(cityId, clientId, startFrom, numberOfRecordNeed, order);
            if (customerDtosResult != null) {
                LOGGER.info("Customers recieved for cityId [{}], clientId [{}], startFrom [{}], numberOfRecordNeed [{}], order [{}]", cityId, clientId, startFrom, numberOfRecordNeed, order);
                responseDto = serviceUtil.getServiceResponse(customerDtosResult);
            } else {
                LOGGER.info("Unable to Retrieve Customers for city id  by pagination");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CUSTOMER_FOR_CITY_ID_CLIENT_ID_BY_PAGINATION);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customer for city if Client Batch by pagination");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CUSTOMER_COUNT_FOR_CITY_ID_CLIENT_ID_CITY_ID_BY_PAGINATION);
        }
        return responseDto;
    }

    public ResponseDto getCustomerSalesInforByCustomerId(Long customerId) {
        LOGGER.info("CustomerServiceImpl.getCustomerSalesInforByCustomerId(customerId) execution started.");
        ResponseDto responseDto = null;
        try {
            CustomerBasicInfoDto customerBasicInfoDto = customerServiceBL.getCustomerSalesInforByCustomerId(customerId);
            if (customerBasicInfoDto != null) {
                LOGGER.info("Customer Sales Infor count for customerId [{}]", customerId);
                responseDto = serviceUtil.getServiceResponse(customerBasicInfoDto);
            } else {
                LOGGER.info("Unable to Retrieve Sales Infor count for customerId [{}]", customerId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CUSTOMER_SALES_INFO_FOR_CUSTOMER_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customer sales infor  for customer Id");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CUSTOMER_SALES_INFO_FOR_CUSTOMER_ID);
        }
        return responseDto;
    }

    public ResponseDto getAllCustomersByClientId(Long clientId) {
        LOGGER.info("CustomerServiceImpl.getAllCustomersByClientId(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<CustomerDto> customerDtosResult = customerServiceBL.getAllCustomersByClientId(clientId);
            if (customerDtosResult != null) {
                LOGGER.info("Customers recieved for clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(customerDtosResult);
            } else {
                LOGGER.info("Unable to Retrieve Customers for client id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CUSTOMERS_FOR_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customers for cclient");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CUSTOMERS_FOR_CLIENT_ID);
        }
        return responseDto;
    }
}
