package com.aplos.service.impl;

import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.SaleDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.SaleService;
import com.aplos.service.bl.SaleServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Service
public class SaleServiceImpl implements SaleService{

    private static final Logger LOGGER = LoggerFactory.getLogger(SaleServiceImpl.class);

    @Autowired
    SaleServiceBL saleServiceBL;

    @Autowired
    ServiceUtil serviceUtil;
    public ResponseDto addSale(SaleDto saleDto) {
        LOGGER.info("SaleServiceImpl.addSale(saleDto) execution started.");
        ResponseDto responseDto = null;
        try {
            SaleDto seleDtoResults = saleServiceBL.addSale(saleDto);
            if (seleDtoResults != null) {
                LOGGER.info("Sale saved");
                responseDto = serviceUtil.getServiceResponse(seleDtoResults);
            } else {
                LOGGER.info("Unable to save sale");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_SALE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while save sale");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_SALE);
        }
        return responseDto;
    }

    public ResponseDto getSalesByCustomerId(Long customerId) {
        LOGGER.info("SaleServiceImpl.getSalesByCustomerId(customerId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<SaleDto> seleDtoResults = saleServiceBL.getSalesByCustomerId(customerId);
            if (seleDtoResults != null) {
                LOGGER.info("Sale recieved");
                responseDto = serviceUtil.getServiceResponse(seleDtoResults);
            } else {
                LOGGER.info("Unable to retrieve sales for customer");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_SALE_FOR_CUSTOMER);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while retrieve sales for customer");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_SALE_FOR_CUSTOMER);
        }
        return responseDto;
    }
}
