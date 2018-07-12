package com.aplos.service;

import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.SaleItemDto;
import com.aplos.domain.SaleItem;

/**
 * Created by Aux072 on 06/06/2018.
 */
public interface SaleItemService {
    public ResponseDto addSaleItem(SaleItemDto saleDto);
}
