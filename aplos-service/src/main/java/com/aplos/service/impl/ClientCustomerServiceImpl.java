package com.aplos.service.impl;

import com.aplos.common.dto.ClientCustomerDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.ClientCustomerService;
import com.aplos.service.bl.ClientCustomerServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class ClientCustomerServiceImpl implements ClientCustomerService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerService.class);

    @Autowired
    ClientCustomerServiceBL clientCustomerServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addClientCustomer(ClientCustomerDto clientCustomerDto) {
        LOGGER.info("ClientCustomerService.addClientCustomer(clientCustomerDto) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientCustomerDto clientCustomerDtoResult = clientCustomerServiceBL.addClientCustomer(clientCustomerDto);
            if (clientCustomerDtoResult != null) {
                LOGGER.info("CustomerSavedFor saved for customerId [{}]", clientCustomerDtoResult.getCustomerId().getCustomerId());
                responseDto = serviceUtil.getServiceResponse(clientCustomerDtoResult);
            } else {
                LOGGER.info("Unable to Save ClientBatch");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_CUSTOMER);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Client Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_CUSTOMER);
        }
        return responseDto;
    }
}
