package com.aplos.service.bl;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.common.dto.ItemDto;
import com.aplos.dao.BatchItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * Created by Aux072 on 30/04/2018.
 */
@Service
public class BatchItemServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceBL.class);

    @Autowired
    BatchItemDao batchItemDao;

    public List<BatchItemDto> addBatchItems(List<BatchItemDto> batchItemDtos){
        LOGGER.info("BatchServiceBL.addBatchItems(batchItemDtos) execution started.");
        return batchItemDao.addBatchItems(batchItemDtos);
    }

    public Integer getItemsCountForBatch(Long batchId){
        LOGGER.info("BatchServiceBL.getItemsCountForBatch(batchId) execution started.");
        return batchItemDao.getItemsCountForBatch(batchId);
    }

    public List<BatchItemDto> getAllItemsForBatchId(Long batchId, Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("BatchServiceBL.getAllItemsForBatchId(batchId, startFrom, numberOfRecordNeeded, order) execution started.");
        return batchItemDao.getAllItemsForBatchId(batchId, startFrom, numberOfRecordNeed, order);
    }

    public List<BatchItemDto> getAllClientBatchItemsForItemId(Long clientId, Long itemId, Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("BatchServiceBL.getAllClientBatchItemsForItemId(clientId, itemId, startFrom, numberOfRecordNeeded, order) execution started.");
        return batchItemDao.getAllClientBatchItemsForItemId(clientId, itemId, startFrom, numberOfRecordNeed, order);
    }

    public Integer getBatchItemsCountForClient(Long clientId){
        LOGGER.info("BatchServiceBL.getBatchItemsCountForClient(clientId) execution started.");
        return batchItemDao.getBatchItemsCountForClient(clientId);
    }

    public List<BatchItemDto> getAllBatchItemsForClientId(Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("BatchServiceBL.getAllBatchItemsForClientId(clientId, startFrom, numberOfRecordNeeded, order) execution started.");
        return batchItemDao.getAllBatchItemsForClientId(clientId, startFrom, numberOfRecordNeed, order);
    }

    public Integer getItemsCountForClientItem(Long clientId, Long itemId){
        LOGGER.info("BatchServiceBL.getItemsCountForClientItem(clientId, itemId) execution started.");
        return batchItemDao.getItemsCountForClientItem(clientId, itemId);
    }

    public Double getStockItemsCountForClientBatchItem(Long batchItemId){
        LOGGER.info("BatchServiceBL.getStockItemsCountForClientBatchItem(batchItemId) execution started.");
        return batchItemDao.getStockItemsCountForClientBatchItem(batchItemId);
    }
}
