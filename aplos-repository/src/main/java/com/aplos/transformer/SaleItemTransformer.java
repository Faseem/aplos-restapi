package com.aplos.transformer;

import com.aplos.common.dto.SaleItemDto;
import com.aplos.domain.SaleItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Service
public class SaleItemTransformer implements BaseTransformer<SaleItem, SaleItemDto> {

    @Autowired
    ItemTransformer itemTransformer;

    @Autowired
    BatchItemTransformer batchItemTransformer;

    @Autowired
    SaleTransformer saleTransformer;


    @Override
    public SaleItemDto transform(SaleItem saleItem) {
        SaleItemDto saleItemDto = new SaleItemDto();
        saleItemDto.setItemId(itemTransformer.transform(saleItem.getItemId()));
        saleItemDto.setBatchItemId(batchItemTransformer.transform(saleItem.getBatchItemId()));
        saleItemDto.setSaleId(saleTransformer.transform(saleItem.getSaleId()));
        saleItemDto.setSaleItemBatchNumber(saleItem.getSaleItemBatchNumber());
        saleItemDto.setSaleItemDiscount(saleItem.getSaleItemDiscountedamount());
        saleItemDto.setSaleItemIsDiscountPercentage(saleItem.getSaleItemIsDiscountPercentage());
        saleItemDto.setSaleItemDiscountedamount(saleItem.getSaleItemDiscountedamount());
        saleItemDto.setSaleItemUnitPrice(saleItem.getSaleItemUnitPrice());
        saleItemDto.setSaleItemTotalNetPay(saleItem.getSaleItemTotalNetPay());
        saleItemDto.setSaleItemQuantity(saleItem.getSaleItemQuantity());
        saleItemDto.setSaleItemId(saleItem.getSaleItemId());
        return saleItemDto;
    }

    @Override
    public SaleItem reverseTransform(SaleItemDto saleItemDto) {
        SaleItem saleItem = new SaleItem();
        saleItem.setItemId(itemTransformer.reverseTransform(saleItemDto.getItemId()));
        saleItem.setSaleId(saleTransformer.reverseTransform(saleItemDto.getSaleId()));
        saleItem.setBatchItemId(batchItemTransformer.reverseTransform(saleItemDto.getBatchItemId()));
        saleItem.setSaleItemBatchNumber(saleItemDto.getSaleItemBatchNumber());
        saleItem.setSaleItemDiscount(saleItemDto.getSaleItemDiscountedamount());
        saleItem.setSaleItemIsDiscountPercentage(saleItemDto.getSaleItemIsDiscountPercentage());
        saleItem.setSaleItemDiscountedamount(saleItemDto.getSaleItemDiscountedamount());
        saleItem.setSaleItemUnitPrice(saleItemDto.getSaleItemUnitPrice());
        saleItem.setSaleItemTotalNetPay(saleItemDto.getSaleItemTotalNetPay());
        saleItem.setSaleItemQuantity(saleItemDto.getSaleItemQuantity());
        saleItem.setSaleItemId(saleItemDto.getSaleItemId());
        return  saleItem;
    }
}
