package com.aplos.service;

import com.aplos.common.dto.ClientCustomerSaleBankPaymentDto;
import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 04/07/2018.
 */
public interface ClientCustomerSaleBankPaymentService {
    public ResponseDto getClientCustomerBankPayment(Long clientId, Long customerId, Long saleId);
    public ResponseDto addClientCustomerSaleBankPayment(ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto);
}
