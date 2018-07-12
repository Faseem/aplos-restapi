package com.aplos.dao;

import com.aplos.common.dto.SaleDto;
import com.aplos.domain.Sale;

import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
public interface SaleDao extends BaseDao<Sale> {
    public SaleDto addSale(SaleDto saleDto);
    public SaleDto getSaleById(Long saleId);
    public List<SaleDto> getSalesByCustomerId(Long customerId);
}
