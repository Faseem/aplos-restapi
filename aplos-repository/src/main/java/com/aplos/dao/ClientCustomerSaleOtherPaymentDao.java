package com.aplos.dao;

import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.domain.ClientCustomerSaleOtherPayment;

import java.util.List;

/**
 * Created by Aux072 on 04/07/2018.
 */
public interface ClientCustomerSaleOtherPaymentDao  extends BaseDao<ClientCustomerSaleOtherPayment> {
    public List<ClientCustomerSaleOtherPaymentDto> getClientCustomerOtherPayment(Long clientId, Long customerId, Long saleId);
    public ClientCustomerSaleOtherPaymentDto addClientCustomerSaleOtherPayment(ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDto);
}
