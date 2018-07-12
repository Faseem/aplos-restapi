package com.aplos.dao.impl;

import com.aplos.common.dto.SaleItemDto;
import com.aplos.dao.SaleItemDao;
import com.aplos.domain.SaleItem;
import com.aplos.transformer.SaleItemTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Repository
public class SaleItemDaoImpl extends BaseDaoImpl<SaleItem> implements SaleItemDao {

    @Autowired
    SaleItemTransformer saleItemTransformer;

    @Override
    public SaleItemDto addSaleItem(SaleItemDto saleItemDto) {
        SaleItem saleItem = saveOrUpdate(saleItemTransformer.reverseTransform(saleItemDto));
        return saleItemTransformer.transform(saleItem);
    }
}

