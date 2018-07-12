package com.aplos.service.impl;

import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.ClientCustomerSaleOtherPaymentService;
import com.aplos.service.bl.ClientCustomerSaleOtherPaymentServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 04/07/2018.
 */
@Service
public class ClientCustomerSaleOtherPaymentServiceImpl implements ClientCustomerSaleOtherPaymentService{
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleOtherPaymentServiceImpl.class);

    @Autowired
    ClientCustomerSaleOtherPaymentServiceBL clientCustomerSaleOtherPaymentServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto getClientCustomerOtherPayment(Long clientId, Long customerId, Long saleId) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ClientCustomerSaleOtherPaymentDto> clientCustomerSaleOtherPaymentDtos = clientCustomerSaleOtherPaymentServiceBL.getClientCustomerOtherPayment(clientId, customerId, saleId);
            if (clientCustomerSaleOtherPaymentDtos != null) {
                LOGGER.info("clientCustomerSaleOtherPayment information received for given parameters clientId [{}] customerId [{}] saleId [{}]",clientId, customerId, saleId);
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleOtherPaymentDtos);
            } else {
                LOGGER.info("clientCustomerSaleOtherPayment information received Error for given parameters clientId [{}] itemId [{}], saleId [{}]",
                        clientId, customerId, saleId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the clientCustomerSaleOtherPayment clientId [{}], custometId [{}], saleId [{}]",
                    clientId, customerId,saleId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT);
        }
        return responseDto;
    }

    public ResponseDto addClientCustomerSaleOtherPayment(ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDto) {
        LOGGER.info("ClientCustomerSaleServiceImpl.addClientCustomerSaleOtherPayment() execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDtoResult = clientCustomerSaleOtherPaymentServiceBL.addClientCustomerSaleOtherPayment(clientCustomerSaleOtherPaymentDto);
            if (clientCustomerSaleOtherPaymentDtoResult != null) {
                LOGGER.info("ClientCustomerSaleOtherPayment information Saved for Id : [{}]", clientCustomerSaleOtherPaymentDtoResult.getClientCustomerSaleOtherPaymentId());
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleOtherPaymentDtoResult);
            } else {
                LOGGER.info("clientCustomerSaleOtherPayment saved");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while saving the clientCustomerSaleOtherPayment");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT);
        }
        return responseDto;
    }
}
