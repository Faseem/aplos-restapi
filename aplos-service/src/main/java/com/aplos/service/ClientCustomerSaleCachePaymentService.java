package com.aplos.service;

import com.aplos.common.dto.ClientCustomerSaleCachePaymentDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 29/06/2018.
 */
public interface ClientCustomerSaleCachePaymentService {
    public ResponseDto getClientCustomerCachePayment(Long clientId, Long customerId, Long saleId);
    public ResponseDto addClientCustomerSaleCachePayment(ClientCustomerSaleCachePaymentDto lientCustomerSaleCachePaymentDto);
}
