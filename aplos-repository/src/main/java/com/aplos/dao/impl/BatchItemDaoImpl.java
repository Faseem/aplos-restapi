package com.aplos.dao.impl;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.dao.BatchItemDao;
import com.aplos.domain.*;
import com.aplos.transformer.BatchItemTransformer;
import com.aplos.transformer.ItemTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@Repository
public class BatchItemDaoImpl extends BaseDaoImpl<BatchItem> implements BatchItemDao {

    @Autowired
    BatchItemTransformer batchItemTransformer;

    @Autowired
    ItemTransformer itemTransformer;

    @Override
    @Transactional
    public List<BatchItemDto> addBatchItems(List<BatchItemDto> batchItemDtos) {
        List<BatchItemDto> batchItemDtosResult = new ArrayList<BatchItemDto>();

        try{
            List<BatchItemDto> timeSheetTaskDtosResult = new ArrayList<>();
            int i=0;
            for (BatchItemDto batchItemDto : batchItemDtos) {
                BatchItem batchItem = batchItemTransformer.reverseTransform(batchItemDto);

                Batch batch = new Batch();
                batch.setBatchId(batchItemDto.getBatchId().getBatchId());
                User userCreated = new User();
                userCreated.setUserId(batchItemDto.getBatchId().getBatchCreateByUserId().getUserId());
                batch.setBatchCreateByUserId(userCreated);
                batchItem.setBatchId(batch);

                Item item = new Item();
                item.setItemId(batchItemDto.getItemId().getItemId());

                batchItem.setItemId(item);


                BatchItem batchItemRes = merge(batchItem);

                timeSheetTaskDtosResult.add(getBatchItemById(batchItemRes.getBatchItemId()));
            }
            return timeSheetTaskDtosResult;
        }catch (Exception e){
            e.printStackTrace();
        }


		return batchItemDtosResult;
    }

    @Override
    public Integer getItemsCountForBatch(Long batchId) {
        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);
        criteria.createAlias("batchId", "batchId");
        criteria.add(Restrictions.eq("batchId.batchId", batchId));
        return (Integer) criteria.list().size();
    }

    @Override
    public List<BatchItemDto> getAllItemsForBatchId(Long batchId, Integer startFrom, Integer numberOfRecordNeed, String order) {
        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);
        if (numberOfRecordNeed != null) {
            criteria.setMaxResults(numberOfRecordNeed);
        }
        if (startFrom != null) {
            criteria.setFirstResult(startFrom);
        }
        if(batchId != null){
            criteria.createAlias("batchId", "batchId");
            criteria.add(Restrictions.eq("batchId.batchId", batchId));
        }
        List<BatchItemDto> batchItemDtos = new ArrayList<>();
        for(BatchItem  batchItem: (ArrayList<BatchItem>)criteria.list()){
            batchItemDtos.add(batchItemTransformer.transform(batchItem));
        }
        return batchItemDtos;
    }

    @Override
    public List<BatchItemDto> getAllClientBatchItemsForItemId(Long clientId, Long itemId, Integer startFrom, Integer numberOfRecordNeed, String order) {

        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);

        if (numberOfRecordNeed != null) {
            criteria.setMaxResults(numberOfRecordNeed);
        }
        if (startFrom != null) {
            criteria.setFirstResult(startFrom);
        }
        if(itemId != null){
            criteria.createAlias("itemId", "itemId");
            criteria.add(Restrictions.eq("itemId.itemId",itemId));
        }
        if(clientId != null){
            criteria.createAlias("clientId", "clientId");
            criteria.add(Restrictions.eq("clientId.clientId",clientId));
        }

        List<BatchItemDto> batchItemDtos = new ArrayList<>();

        for(BatchItem  batchItem: (ArrayList<BatchItem>)criteria.list()){
            batchItemDtos.add(batchItemTransformer.transform(batchItem));
        }

        return batchItemDtos;

    }

    @Override
    public Integer getBatchItemsCountForClient(Long clineID) {
        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clineID));
        return (Integer) criteria.list().size();
    }

    @Override
    public List<BatchItemDto> getAllBatchItemsForClientId(Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order) {
        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);
        if (numberOfRecordNeed != null) {
            criteria.setMaxResults(numberOfRecordNeed);
        }
        if (startFrom != null) {
            criteria.setFirstResult(startFrom);
        }
        if(clientId != null){
            criteria.createAlias("clientId", "clientId");
            criteria.add(Restrictions.eq("clientId.clientId", clientId));
        }
        List<BatchItemDto> batchItemDtos = new ArrayList<>();
        for(BatchItem  batchItem: (ArrayList<BatchItem>)criteria.list()){
            batchItemDtos.add(batchItemTransformer.transform(batchItem));
        }
        return batchItemDtos;
    }

    @Override
    public Integer getItemsCountForClientItem(Long clientId, Long itemId) {
        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.createAlias("itemId", "itemId");
        criteria.add(Restrictions.eq("itemId.itemId", itemId));
        return (Integer) criteria.list().size();
    }

    @Override
    public Double getStockItemsCountForClientBatchItem(Long batchItemId) {
        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);
        criteria.add(Restrictions.eq("batchItemId", batchItemId));
        BatchItem batchItem = (BatchItem) criteria.uniqueResult();
        return batchItem.getBatchItemQuantity();
    }

    @Override
    public BatchItemDto getBatchItemById(Long batchItemId){
        Criteria criteria = getCurrentSession().createCriteria(BatchItem.class);
        criteria.add(Restrictions.eq("batchItemId", batchItemId));
        criteria.setMaxResults(1);
        return batchItemTransformer.transform((BatchItem) criteria.uniqueResult());
    }

    @Override
    public BatchItemDto updateBatchItem(BatchItemDto batchItemDto) {
        BatchItem batchItemResult =  merge(batchItemTransformer.reverseTransform(batchItemDto));
        return batchItemTransformer.transform(batchItemResult);
    }


}


