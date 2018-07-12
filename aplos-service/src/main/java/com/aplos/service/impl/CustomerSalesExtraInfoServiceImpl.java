package com.aplos.service.impl;

import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.CustomerSalesExtraInfoService;
import com.aplos.service.bl.CustomerSalesExtraInfoServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Aux072 on 02/06/2018.
 */
@Service
public class CustomerSalesExtraInfoServiceImpl implements CustomerSalesExtraInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRatingServiceImpl.class);

    @Autowired
    CustomerSalesExtraInfoServiceBL customerSalesExtraInfoServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto getCustomerSalesInforByCustomerId(Long customerId) {
        LOGGER.info("CustomerAddressServiceImpl.getCustomerAddressCountByCityId(cityId) execution started.");
        ResponseDto responseDto = null;
        try {
            CustomerSalesExtraInfoDto customerSalesExtraInfoDto = customerSalesExtraInfoServiceBL.getCustomerSalesInforByCustomerId(customerId);
            if (customerSalesExtraInfoDto != null) {
                LOGGER.info("Get CustomerSalesExtraInfoDto for CustomerId [{}]", customerId);
                responseDto = serviceUtil.getServiceResponse(customerSalesExtraInfoDto);
            } else {
                LOGGER.info("Unable to Get CustomerSalesExtraInfoDto for CustomerId [{}]", customerId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_EXTRA_CUSTOMER_SALES_INFO_FOR_CUSTOME_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve customer sales extra infor for customer id");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_EXTRA_CUSTOMER_SALES_INFO_FOR_CUSTOMER_ID);
        }
        return responseDto;
    }

    public ResponseDto addCustomerSalesExtraInfo(@RequestBody CustomerSalesExtraInfoDto customerSalesExtraInfoDto) {
        LOGGER.info("CustomerAddressServiceImpl.addCustomerSalesExtraInfo(customerSalesExtraInfoDto) execution started.");
        ResponseDto responseDto = null;
        try {
            CustomerSalesExtraInfoDto customerSalesExtraInfoDtoResult = customerSalesExtraInfoServiceBL.addCustomerSalesExtraInfo(customerSalesExtraInfoDto);
            if (customerSalesExtraInfoDtoResult != null) {
                LOGGER.info("Update CustomerSalesExtraInfoDto for CustomerId [{}]", customerSalesExtraInfoDtoResult.getCustomerId().getCustomerId());
                responseDto = serviceUtil.getServiceResponse(customerSalesExtraInfoDtoResult);
            } else {
                LOGGER.info("Unable to update CustomerSalesExtraInfoDto for CustomerId [{}]", customerSalesExtraInfoDtoResult.getCustomerId().getCustomerId());
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_EXTRA_CUSTOMER_SALES_INFO);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while update customer sales extra infor for customer id");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_EXTRA_CUSTOMER_SALES_INFO);
        }
        return responseDto;
    }
}
