package com.aplos.dao;

import com.aplos.common.dto.SaleItemDto;
import com.aplos.domain.SaleItem;

/**
 * Created by Aux072 on 06/06/2018.
 */
public interface SaleItemDao extends BaseDao<SaleItem> {
    public SaleItemDto addSaleItem(SaleItemDto saleItemDto);
}
