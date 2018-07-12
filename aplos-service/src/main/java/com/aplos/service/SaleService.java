package com.aplos.service;

import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.SaleDto;

/**
 * Created by Aux072 on 06/06/2018.
 */
public interface SaleService {
    public ResponseDto addSale(SaleDto saleDto);
    public ResponseDto getSalesByCustomerId(Long customerId);
}
