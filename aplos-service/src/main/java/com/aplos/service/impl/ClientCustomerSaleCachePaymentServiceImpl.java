package com.aplos.service.impl;

import com.aplos.common.dto.ClientCustomerSaleCachePaymentDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.ClientCustomerSaleCachePaymentService;
import com.aplos.service.bl.ClientCustomerSaleCachePaymentServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 29/06/2018.
 */
@Service
public class ClientCustomerSaleCachePaymentServiceImpl implements ClientCustomerSaleCachePaymentService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleCachePaymentService.class);

    @Autowired
    ClientCustomerSaleCachePaymentServiceBL clientCustomerSaleCachePaymentServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto getClientCustomerCachePayment(Long clientId, Long customerId, Long saleId) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ClientCustomerSaleCachePaymentDto> clientCustomerSaleCachePaymentDtos = clientCustomerSaleCachePaymentServiceBL.getClientCustomerCachePayment(clientId, customerId, saleId);
            if (clientCustomerSaleCachePaymentDtos != null) {
                LOGGER.info("clientCustomerSaleCachePayment information received for given parameters clientId [{}] customerId [{}] saleId [{}]",clientId, customerId, saleId);
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleCachePaymentDtos);
            } else {
                LOGGER.info("clientCustomerSaleCachePayment information received Error for given parameters clientId [{}] itemId [{}], saleId [{}]",
                        clientId, customerId, saleId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the clientCustomerSaleCachePayment clientId [{}], custometId [{}], saleId [{}]",
                    clientId, customerId,saleId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT);
        }
        return responseDto;
    }

    public ResponseDto addClientCustomerSaleCachePayment(ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDto) {
        LOGGER.info("ClientCustomerSaleServiceImpl.addClientCustomerSaleCachePayment() execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDtoResult = clientCustomerSaleCachePaymentServiceBL.addClientCustomerSaleCachePayment(clientCustomerSaleCachePaymentDto);
            if (clientCustomerSaleCachePaymentDtoResult != null) {
                LOGGER.info("ClientCustomerSaleCachePayment information Saved for Id : [{}]", clientCustomerSaleCachePaymentDtoResult.getClientCustomerSaleCachePaymentId());
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleCachePaymentDtoResult);
            } else {
                LOGGER.info("clientCustomerSaleCachePayment saved");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while saving the clientCustomerSaleCachePayment");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT);
        }
        return responseDto;
    }
}
