package com.aplos.service.impl;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.ClientCustomerSaleService;
import com.aplos.service.bl.ClientCustomerSaleServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 05/06/2018.
 */
@Service
public class ClientCustomerSaleServiceImpl implements ClientCustomerSaleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleServiceImpl.class);

    @Autowired
    ClientCustomerSaleServiceBL clientCustomerSaleServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addClientCustomerSale(ClientCustomerSaleDto clientCustomerSaleDto) {
        LOGGER.info("ClientCustomerSaleServiceImpl.addClientCustomerSale(clientCustomerSaleDto) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCustomerSaleDto clientCustomerSaleDtoResult = clientCustomerSaleServiceBL.addClientCustomerSale(clientCustomerSaleDto);
            if (clientCustomerSaleDtoResult != null) {
                LOGGER.info("ClientCustomerSale saved for clienCustomerSaleId [{}]", clientCustomerSaleDtoResult.getClientCustomerSaleId());
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleDtoResult);
            } else {
                LOGGER.info("Unable to Save ClientCity");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_CUSTOMER_SALE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving clientCustomersale");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_CUSTOMER_SALE);
        }
        return responseDto;
    }

    public ResponseDto getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ClientCustomerSaleDto> clientCustomerSaleDtos = clientCustomerSaleServiceBL.getAllSalesForCustomerIdClientId(clientId, customerId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
            if (clientCustomerSaleDtos != null) {
                LOGGER.info("clientCustomerSaleDtos information received for given parameters clientId [{}] customerId [{}] startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, customerId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleDtos);
            } else {
                LOGGER.info("clientCustomerSaleDtos information received Error for given parameters clientId [{}] itemId [{}], startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, customerId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_CUSTOMER_SALE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving theUsers information received for given parameters startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                    startFrom, numberOfRecordNeed,order);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_CUSTOMER_SALE);
        }
        return responseDto;
    }

    public ResponseDto getCountForClientCustomerSale(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getCountForClientCustomerSale(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate) execution started.");
        ResponseDto responseDto = null;
        try {
            Integer count = clientCustomerSaleServiceBL.getCountForClientCustomerSale(clientId, customerId, isOmitSettled, startDate, endDate);
            if (count != null) {
                LOGGER.info("CountForClientCustomerSale information received for given parameters clientId [{}] customerId [{}]",
                        clientId, customerId);
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("CountForClientCustomerSale information received Error for given parameters clientId [{}] customerId [{}]",
                        clientId, customerId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_COUNT_FOR_CLIENT_CUSTOMER_SALE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving Count information received for given parameters clientId [{}] customerId [{}]",
                    clientId, customerId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_COUNT_FOR_CLIENT_CUSTOMER_SALE);
        }
        return responseDto;
    }


    public ResponseDto getAllSalesForUserIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ClientCustomerSaleDto> clientCustomerSaleDtos = clientCustomerSaleServiceBL.getAllSalesForUserIdClientId(clientId, customerId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
            if (clientCustomerSaleDtos != null) {
                LOGGER.info("clientCustomerSaleDtos information received for given parameters clientId [{}] customerId [{}] startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, customerId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleDtos);
            } else {
                LOGGER.info("clientCustomerSaleDtos information received Error for given parameters clientId [{}] itemId [{}], startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, customerId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_USER_SALE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving theUsers information received for given parameters startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                    startFrom, numberOfRecordNeed,order);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_USER_SALE);
        }
        return responseDto;
    }

    public ResponseDto getCountForClientUserSale(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getAllSalesForUserIdClientId(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate) execution started.");
        ResponseDto responseDto = null;
        try {
            Integer count = clientCustomerSaleServiceBL.getCountForClientUserSale(clientId, userId, isOmitSettled, startDate, endDate);
            if (count != null) {
                LOGGER.info("CountForClientCustomerSale information received for given parameters clientId [{}] userId [{}]",
                        clientId, userId);
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("CountForClientCustomerSale information received Error for given parameters clientId [{}] userId [{}]",
                        clientId, userId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_COUNT_FOR_CLIENT_USER_SALE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving Count information received for given parameters clientId [{}] userId [{}]",
                    clientId, userId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_COUNT_FOR_CLIENT_USER_SALE);
        }
        return responseDto;
    }

    public ResponseDto getClientCustomerSale(Long clientId, Long customerId, Long saleId) {
        LOGGER.info("ClientCustomerSaleServiceImpl.getClientCustomerSale(clientId, customerId, saleId) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCustomerSaleDto clientCustomerSaleDtoResult = clientCustomerSaleServiceBL.getClientCustomerSale(clientId, customerId, saleId);
            if (clientCustomerSaleDtoResult != null) {
                LOGGER.info("ClientCustomerSale recieved for clienCustomerSaleId [{}]", clientCustomerSaleDtoResult.getClientCustomerSaleId());
                responseDto = serviceUtil.getServiceResponse(clientCustomerSaleDtoResult);
            } else {
                LOGGER.info("Unable to retrieve clientCustomerSale");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_CUSTOMER_SALE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve clientCustomersale");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_CUSTOMER_SALE);
        }
        return responseDto;
    }

}
