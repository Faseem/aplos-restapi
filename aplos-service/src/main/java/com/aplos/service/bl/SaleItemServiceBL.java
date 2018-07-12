package com.aplos.service.bl;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.common.dto.SaleItemDto;
import com.aplos.dao.BatchItemDao;
import com.aplos.dao.SaleItemDao;
import com.aplos.domain.BatchItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Service
public class SaleItemServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(SaleItemServiceBL.class);

    @Autowired
    SaleItemDao saleItemDao;

    @Autowired
    BatchItemDao batchItemDao;

    public SaleItemDto addSaleItem(SaleItemDto saleItemDto){
        LOGGER.info("SaleItemServiceBL.addSaleItem(saleDto) execution started.");
        //update batch item counts here...
        SaleItemDto saleItemDtoRet = this.updateBatchItemCount(saleItemDto);
        return saleItemDao.addSaleItem(saleItemDtoRet);
    }

    private SaleItemDto updateBatchItemCount(SaleItemDto saleItemDto){
        LOGGER.info("SaleItemServiceBL.updateBatchItemCount(SaleItemDto saleItemDto) execution started.");
        BatchItemDto batchItemDto = batchItemDao.getBatchItemById(saleItemDto.getBatchItemId().getBatchItemId());
        if(batchItemDto.getBatchItemQuantity()<saleItemDto.getSaleItemQuantity()){
            saleItemDto.setSaleItemQuantity(batchItemDto.getBatchItemQuantity());
        }
        batchItemDto.setBatchItemQuantity(batchItemDto.getBatchItemQuantity() - saleItemDto.getSaleItemQuantity());

        List<BatchItemDto> bachItems = new ArrayList<BatchItemDto>();
        bachItems.add(batchItemDto);
        List<BatchItemDto> batchItemDtoRes =  batchItemDao.addBatchItems(bachItems);

        /*BatchItemDto batchItemDto1 = new BatchItemDto();
        batchItemDto1.setBatchItemId(batchItemDtoRes.getBatchItemId());*/

        if(batchItemDtoRes!=null){
            LOGGER.info("BatchItem updated successfully");
        }
        //saleItemDto.setBatchItemId(batchItemDto1);
        return saleItemDto;
    }
}
