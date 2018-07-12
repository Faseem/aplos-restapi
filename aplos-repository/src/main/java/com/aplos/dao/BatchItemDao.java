package com.aplos.dao;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.common.dto.ItemDto;
import com.aplos.domain.BatchItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
public interface BatchItemDao extends BaseDao<BatchItem> {
    public List<BatchItemDto> addBatchItems(List<BatchItemDto> batchItemDtos);
    public Integer getItemsCountForBatch(Long batchId);
    public List<BatchItemDto> getAllItemsForBatchId(Long batchId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public List<BatchItemDto> getAllClientBatchItemsForItemId(Long clientId, Long itemId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public Integer getBatchItemsCountForClient(Long clineID);
    public List<BatchItemDto> getAllBatchItemsForClientId(Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public Integer getItemsCountForClientItem(Long clientId, Long itemId);
    public Double getStockItemsCountForClientBatchItem(Long batchItemId);
    public BatchItemDto getBatchItemById(Long batchItemId);
    public BatchItemDto updateBatchItem(BatchItemDto batchItemDto);
}
