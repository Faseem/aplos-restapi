package com.aplos.service.impl;

import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.SaleDto;
import com.aplos.common.dto.SaleItemDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.SaleItemService;
import com.aplos.service.bl.SaleItemServiceBL;
import com.aplos.service.bl.SaleServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Service
public class SaleItemServiceImpl implements SaleItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SaleItemServiceImpl.class);

    @Autowired
    SaleItemServiceBL saleItemServiceBL;

    @Autowired
    ServiceUtil serviceUtil;
    public ResponseDto addSaleItem(SaleItemDto saleItemDto) {
        LOGGER.info("SaleServiceImpl.addSale(saleDto) execution started.");
        ResponseDto responseDto = null;
        try {
            SaleItemDto seleItemDtoResults = saleItemServiceBL.addSaleItem(saleItemDto);
            if (seleItemDtoResults != null) {
                LOGGER.info("Sale Item saved");
                responseDto = serviceUtil.getServiceResponse(seleItemDtoResults);
            } else {
                LOGGER.info("Unable to save sale Item");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_SALE_ITEM);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while save sale Item");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_SALE_ITEM);
        }
        return responseDto;
    }
}
