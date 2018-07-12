package com.aplos.service;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.common.dto.ResponseDto;

import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
public interface BatchItemService {
    public ResponseDto addBatchItems(List<BatchItemDto> batchItemDtos);
    public ResponseDto getItemsCountForBatch(Long batchId);
    public ResponseDto getAllItemsForBatchId(Long batchId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public ResponseDto getAllClientBatchItemsForItemId(Long clientId,Long itemId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public ResponseDto getBatchItemsCountForClient(Long clientId);
    public ResponseDto getAllBatchItemsForClientId(Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public ResponseDto getItemsCountForClientItem(Long clientId, Long itemId);
    public ResponseDto getStockItemsCountForClientBatchItem(Long batchItemId);
}
