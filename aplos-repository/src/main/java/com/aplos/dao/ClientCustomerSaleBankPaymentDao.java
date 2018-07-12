package com.aplos.dao;

import com.aplos.common.dto.ClientCustomerSaleBankPaymentDto;
import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.domain.ClientCustomerSaleBankPayment;
import com.aplos.domain.ClientCustomerSaleOtherPayment;

import java.util.List;

/**
 * Created by Aux072 on 04/07/2018.
 */
public interface ClientCustomerSaleBankPaymentDao extends BaseDao<ClientCustomerSaleBankPayment> {
    public List<ClientCustomerSaleBankPaymentDto> getClientCustomerBankPayment(Long clientId, Long customerId, Long saleId);
    public ClientCustomerSaleBankPaymentDto addClientCustomerSaleBankPayment(ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto);
}
