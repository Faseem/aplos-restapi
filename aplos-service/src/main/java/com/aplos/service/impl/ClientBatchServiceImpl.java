package com.aplos.service.impl;

import com.aplos.common.dto.ClientBatchDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.domain.ClientBatch;
import com.aplos.service.ClientBatchService;

import com.aplos.service.bl.ClientBatchServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 02/05/2018.
 */
@Service
public class ClientBatchServiceImpl implements ClientBatchService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientBatchServiceImpl.class);

    @Autowired
    ClientBatchServiceBL clientBatchServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addClientBatch(ClientBatchDto clientBatchDto) {
        LOGGER.info("ClientBatchServiceImpl.addClientBatch(clientBatchDto) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientBatchDto batchDtoResult = clientBatchServiceBL.addClientBatch(clientBatchDto);
            if (batchDtoResult != null) {
                LOGGER.info("Batch saved for batchId [{}]", batchDtoResult.getBatchId());
                responseDto = serviceUtil.getServiceResponse(batchDtoResult);
            } else {
                LOGGER.info("Unable to Save ClientBatch");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_BATCH);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Client Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_BATCH);
        }
        return responseDto;
    }
}
