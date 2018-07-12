package com.aplos.transformer;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.domain.BatchItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@Service
public class BatchItemTransformer implements BaseTransformer<BatchItem,BatchItemDto> {
    @Autowired
    BatchTransformaer batchTransformaer;

    @Autowired
    ClientItemTransformer clientItemTransformer;

    @Autowired
    ItemTransformer itemTransformer;

    @Autowired
    ClientTrasformenr clientTrasformenr;



    @Override
    public BatchItemDto transform(BatchItem batchItem) {
        BatchItemDto batchItemDto = new BatchItemDto();
        //batchItemDto.setBatchBatchItemList(batchTransformaer.transform(batchItem.getBatchI()));
        batchItemDto.setBatchItemDescription(batchItem.getBatchItemDescription());
        batchItemDto.setBatchItemExpiredDate(batchItem.getBatchItemExpiredDate());
        batchItemDto.setBatchItemId(batchItem.getBatchItemId());
        batchItemDto.setBatchItemManufacturedDate(batchItem.getBatchItemManufacturedDate());
        batchItemDto.setBatchItemQuantity(batchItem.getBatchItemQuantity());
        batchItemDto.setBatchItemSellingPrice(batchItem.getBatchItemSellingPrice());
        batchItemDto.setBatchItemUnitPrice(batchItem.getBatchItemUnitPrice());
        batchItemDto.setItemId(itemTransformer.transform(batchItem.getItemId()));
        batchItemDto.setBatchId(batchTransformaer.transform(batchItem.getBatchId()));
        batchItemDto.setClientId(clientTrasformenr.transform(batchItem.getClientId()));


        return batchItemDto;
    }

    @Override
    public BatchItem reverseTransform(BatchItemDto batchItemDto) {
        BatchItem batchItem = new BatchItem();
        batchItem.setBatchItemDescription(batchItemDto.getBatchItemDescription());
        batchItem.setBatchItemExpiredDate(batchItemDto.getBatchItemExpiredDate());
        batchItem.setBatchItemId(batchItemDto.getBatchItemId());
        batchItem.setBatchItemManufacturedDate(batchItemDto.getBatchItemManufacturedDate());
        batchItem.setBatchItemQuantity(batchItemDto.getBatchItemQuantity());
        batchItem.setBatchItemSellingPrice(batchItemDto.getBatchItemSellingPrice());
        batchItem.setBatchItemUnitPrice(batchItemDto.getBatchItemUnitPrice());
        batchItem.setItemId(itemTransformer.reverseTransform(batchItemDto.getItemId()));
        batchItem.setBatchId(batchTransformaer.reverseTransform(batchItemDto.getBatchId()));
        batchItem.setClientId(clientTrasformenr.reverseTransform(batchItemDto.getClientId()));

        return batchItem;
    }
}
