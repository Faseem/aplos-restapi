package com.aplos.service.impl;

import com.aplos.common.dto.ClientCustomerSaleBankPaymentDto;
import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.ClientCustomerSaleBankPaymentService;
import com.aplos.service.ClientCustomerSaleOtherPaymentService;
import com.aplos.service.bl.ClientCustomerSaleBankPaymentServiceBL;
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
public class ClientCustomerSaleBankPaymentServiceImpl implements ClientCustomerSaleBankPaymentService{
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleBankPaymentServiceImpl.class);

    @Autowired
    ClientCustomerSaleBankPaymentServiceBL clientCustomerSaleBankPaymentServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto getClientCustomerBankPayment(Long clientId, Long customerId, Long saleId) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ClientCustomerSaleBankPaymentDto> clientCustomerSaleBankPaymentDtos = clientCustomerSaleBankPaymentServiceBL.getClientCustomerBankPayment(clientId, customerId, saleId);
            if (clientCustomerSaleBankPaymentDtos != null) {
                LOGGER.info("clientCustomerSaleBankPayment information received for given parameters clientId [{}] customerId [{}] saleId [{}]",clientId, customerId, saleId);
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleBankPaymentDtos);
            } else {
                LOGGER.info("clientCustomerSaleBankPayment information received Error for given parameters clientId [{}] itemId [{}], saleId [{}]",
                        clientId, customerId, saleId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the clientCustomerSaleBankPayment clientId [{}], custometId [{}], saleId [{}]",
                    clientId, customerId,saleId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT);
        }
        return responseDto;
    }

    public ResponseDto addClientCustomerSaleBankPayment(ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto) {
        LOGGER.info("ClientCustomerSaleServiceImpl.addClientCustomerSaleBankPayment() execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDtoResult = clientCustomerSaleBankPaymentServiceBL.addClientCustomerSaleBankPayment(clientCustomerSaleBankPaymentDto);
            if (clientCustomerSaleBankPaymentDtoResult != null) {
                LOGGER.info("ClientCustomerSaleBankPayment information Saved for Id : [{}]", clientCustomerSaleBankPaymentDtoResult.getClientCustomerSaleBankPaymentId());
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleBankPaymentDtoResult);
            } else {
                LOGGER.info("clientCustomerSaleBankPayment saved");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while saving the clientCustomerSaleBankPayment");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT);
        }
        return responseDto;
    }
}
