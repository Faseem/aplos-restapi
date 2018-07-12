package com.aplos.service.impl;

import com.aplos.common.dto.BatchDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.BatchService;
import com.aplos.service.bl.BatchServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@Service
public class BatchServiceImpl implements BatchService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BatchServiceImpl.class);

    @Autowired
    BatchServiceBL batchServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addBatch(BatchDto batchDto) {
        LOGGER.info("BatchServiceImpl.addBatch(batchDto) execution started.");
        ResponseDto responseDto = null;
        try {
            BatchDto batchDtoResult = batchServiceBL.addBatch(batchDto);
            if (batchDtoResult != null) {
                LOGGER.info("Batch saved for batchId [{}]", batchDtoResult.getBatchId());
                responseDto = serviceUtil.getServiceResponse(batchDtoResult);
            } else {
                LOGGER.info("Unable to Save Batch");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_BATCH);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_BATCH);
        }
        return responseDto;
    }

    public ResponseDto getAllBatchesForClient(Long clientId){
        LOGGER.info("BatchServiceImpl.getAllBatchesForClient(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<BatchDto> batchDtosResult = batchServiceBL.getAllBatchesForClient(clientId);
            if (batchDtosResult != null) {
                LOGGER.info("Get All Batch For clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(batchDtosResult);
            } else {
                LOGGER.info("Unable to retrieve Batches for clientId [{}]", clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_GET_CLIENT_BATCH);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Get Clint Batches");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_GET_CLIENT_BATCH);
        }
        return responseDto;
    }
}
