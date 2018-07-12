package com.aplos.dao;

import com.aplos.common.dto.ClientCustomerSaleCachePaymentDto;
import com.aplos.domain.ClientCustomerSaleCachePayment;

import java.util.List;

/**
 * Created by Aux072 on 29/06/2018.
 */
public interface ClientCustomerSaleCachePaymentDao  extends BaseDao<ClientCustomerSaleCachePayment> {
    public List<ClientCustomerSaleCachePaymentDto> getClientCustomerCachePayment(Long clientId, Long customerId, Long saleId);
    public ClientCustomerSaleCachePaymentDto addClientCustomerSaleCachePayment(ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDto);
}
