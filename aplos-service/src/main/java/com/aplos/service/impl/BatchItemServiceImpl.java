package com.aplos.service.impl;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.common.dto.ItemDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.domain.BatchItem;
import com.aplos.service.BatchItemService;
import com.aplos.service.bl.BatchItemServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@Service
public class BatchItemServiceImpl implements BatchItemService{

    private static final Logger LOGGER = LoggerFactory.getLogger(BatchServiceImpl.class);

    @Autowired
    BatchItemServiceBL batchItemServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addBatchItems(List<BatchItemDto> batchItemDtos) {
        LOGGER.info("BatchItemServiceImpl.addBatchItems(batchDtos) execution started.");
        ResponseDto responseDto = null;
        try {
            List<BatchItemDto> batchItemDtosResult = batchItemServiceBL.addBatchItems(batchItemDtos);
            if (batchItemDtosResult != null) {
                LOGGER.info("BatchItems saved");
                responseDto = serviceUtil.getServiceResponse(batchItemDtosResult);
            } else {
                LOGGER.info("Unable to Save Batch items");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_BATCH_ITEMS);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_BATCH_ITEMS);
        }
        return responseDto;
    }

    public ResponseDto getItemsCountForBatch(Long batchId) {
        LOGGER.info("BatchItemServiceImpl.getItemsCountForBatch(batchId) execution started.");
        ResponseDto responseDto = null;
        try {
            Integer count = batchItemServiceBL.getItemsCountForBatch(batchId);
            if (count != null) {
                LOGGER.info("BatchItems count received");
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("Unable to Get count");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_GET_BATCH_ITEMS_COUNT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_GET_BATCH_ITEMS_COUNT);
        }
        return responseDto;
    }

    public ResponseDto getAllItemsForBatchId(Long batchId, Integer startFrom, Integer numberOfRecordNeed, String order) {
        LOGGER.info("BatchItemServiceImpl.getAllItemsForBatchId(Long batchId, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<BatchItemDto> batchItemDtos = batchItemServiceBL.getAllItemsForBatchId(batchId, startFrom, numberOfRecordNeed, order);
            if (batchItemDtos != null) {
                LOGGER.info("Items information received for given parameters batchId [{}] startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        batchId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil.getServiceResponse(batchItemDtos);
            } else {
                LOGGER.info("Items information received Error for given parameters batchId [{}], startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        batchId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_BATCHITEM_BATCH);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving theUsers information received for given parameters startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                    startFrom, numberOfRecordNeed,order);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_BATCHITEM_BATCH);
        }
        return responseDto;
    }

    public ResponseDto getAllClientBatchItemsForItemId(Long clientId, Long itemId, Integer startFrom, Integer numberOfRecordNeed, String order) {
        LOGGER.info("BatchItemServiceImpl.getAllClientBatchItemsForItemId(Long clientId, Long itemId, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<BatchItemDto> batchItemDtos = batchItemServiceBL.getAllClientBatchItemsForItemId(clientId, itemId, startFrom, numberOfRecordNeed, order);
            if (batchItemDtos != null) {
                LOGGER.info("BatchItems information received for given parameters clientId [{}] itemId [{}] startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, itemId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil.getServiceResponse(batchItemDtos);
            } else {
                LOGGER.info("Items information received Error for given parameters clientId [{}] itemId [{}], startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, itemId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_BATCHITEM_ITEM);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving theUsers information received for given parameters startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                    startFrom, numberOfRecordNeed,order);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_BATCHITEM_ITEM);
        }
        return responseDto;
    }

    public ResponseDto getBatchItemsCountForClient(Long clientId) {
        LOGGER.info("BatchItemServiceImpl.getBatchItemsCountForClient(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            Integer count = batchItemServiceBL.getBatchItemsCountForClient(clientId);
            if (count != null) {
                LOGGER.info("BatchItems count received for clientId");
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("Unable to Get count for client id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_GET_BATCH_ITEMS_COUNT_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Batch");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_GET_BATCH_ITEMS_COUNT_CLIENT_ID);
        }
        return responseDto;
    }

    public ResponseDto getAllBatchItemsForClientId(Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order) {
        LOGGER.info("BatchItemServiceImpl.getAllBatchItemsForClientId(Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<BatchItemDto> batchItemDtos = batchItemServiceBL.getAllBatchItemsForClientId(clientId, startFrom, numberOfRecordNeed, order);
            if (batchItemDtos != null) {
                LOGGER.info("Items information received for given parameters clientId [{}] startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil.getServiceResponse(batchItemDtos);
            } else {
                LOGGER.info("Items information received Error for given parameters clientId [{}], startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        clientId, startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_BATCHITEM_CLIENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the BatchItems information received for given parameters clientId [{}], startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                    clientId, startFrom, numberOfRecordNeed,order);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_BATCHITEM_CLIENT);
        }
        return responseDto;
    }

    public ResponseDto getItemsCountForClientItem(Long clientId, Long itemId) {
        LOGGER.info("BatchItemServiceImpl.getItemsCountForClientItem(clientId, itemId) execution started.");
        ResponseDto responseDto = null;
        try {
            Integer count = batchItemServiceBL.getItemsCountForClientItem(clientId, itemId);
            if (count != null) {
                LOGGER.info("BatchItems count received for clientId ItemId");
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("Unable to Get count for client id Item id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_GET_BATCH_ITEMS_COUNT_CLIENT_ID_ITEM_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Retriving the batch item count for client id bath id");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_GET_BATCH_ITEMS_COUNT_CLIENT_ID_ITEM_ID);
        }
        return responseDto;
    }

    public ResponseDto getStockItemsCountForClientBatchItem(Long batchItemId) {
        LOGGER.info("BatchItemServiceImpl.getStockItemsCountForClientBatchItem(batchItemId) execution started.");
        ResponseDto responseDto = null;
        try {
            Double count = batchItemServiceBL.getStockItemsCountForClientBatchItem(batchItemId);
            if (count != null) {
                LOGGER.info("BatchItems stock count received for batchItem id");
                responseDto = serviceUtil.getServiceResponse(count);
            } else {
                LOGGER.info("Unable to Get stock count for batchItem id");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_GET_BATCH_ITEMS_COUNT_BATCH_ITEM_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Retriving the batch item id");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_GET_BATCH_ITEMS_COUNT_BATCH_ITEM_ID);
        }
        return responseDto;
    }
}
