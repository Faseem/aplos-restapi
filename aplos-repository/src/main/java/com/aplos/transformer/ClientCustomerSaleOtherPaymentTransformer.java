package com.aplos.transformer;

import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.domain.ClientCustomerSaleOtherPayment;
import com.aplos.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 11/06/2018.
 */
@Service
public class ClientCustomerSaleOtherPaymentTransformer implements BaseTransformer<ClientCustomerSaleOtherPayment, ClientCustomerSaleOtherPaymentDto> {

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    CustomerTransformer customerTransformer;

    @Autowired
    SaleTransformer saleTransformer;

    @Override
    public ClientCustomerSaleOtherPaymentDto transform(ClientCustomerSaleOtherPayment clientCustomerSaleOtherPayment) {
        ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDto = new ClientCustomerSaleOtherPaymentDto();
        clientCustomerSaleOtherPaymentDto.setClientId(clientTrasformenr.transform(clientCustomerSaleOtherPayment.getClientId()));
        clientCustomerSaleOtherPaymentDto.setAcceptedUserId(userTransformer.transform(clientCustomerSaleOtherPayment.getAcceptedUserId()));
        clientCustomerSaleOtherPaymentDto.setClientCustomerSaleOtherPaymentId(clientCustomerSaleOtherPayment.getClientCustomerSaleOtherPaymentId());
        clientCustomerSaleOtherPaymentDto.setCustomerId(customerTransformer.transform(clientCustomerSaleOtherPayment.getCustomerId()));
        clientCustomerSaleOtherPaymentDto.setPaymentAmount(clientCustomerSaleOtherPayment.getPaymentAmount());
        clientCustomerSaleOtherPaymentDto.setPaymentDate(clientCustomerSaleOtherPayment.getPaymentDate());
        clientCustomerSaleOtherPaymentDto.setPaymentIsSettled(clientCustomerSaleOtherPayment.getPaymentIsSettled());
        clientCustomerSaleOtherPaymentDto.setPaymentDescription(clientCustomerSaleOtherPayment.getPaymentDescription());
        clientCustomerSaleOtherPaymentDto.setPaymentSettledDate(clientCustomerSaleOtherPayment.getPaymentSettledDate());
        clientCustomerSaleOtherPaymentDto.setSaleId(saleTransformer.transform(clientCustomerSaleOtherPayment.getSaleId()));

        return clientCustomerSaleOtherPaymentDto;
    }

    @Override
    public ClientCustomerSaleOtherPayment reverseTransform(ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDto) {
        ClientCustomerSaleOtherPayment clientCustomerSaleOtherPayment = new ClientCustomerSaleOtherPayment();
        clientCustomerSaleOtherPayment.setClientId(clientTrasformenr.reverseTransform(clientCustomerSaleOtherPaymentDto.getClientId()));
        clientCustomerSaleOtherPayment.setAcceptedUserId(userTransformer.reverseTransform(clientCustomerSaleOtherPaymentDto.getAcceptedUserId()));
        clientCustomerSaleOtherPayment.setClientCustomerSaleOtherPaymentId(clientCustomerSaleOtherPaymentDto.getClientCustomerSaleOtherPaymentId());
        clientCustomerSaleOtherPayment.setCustomerId(customerTransformer.reverseTransform(clientCustomerSaleOtherPaymentDto.getCustomerId()));
        clientCustomerSaleOtherPayment.setPaymentAmount(clientCustomerSaleOtherPaymentDto.getPaymentAmount());
        clientCustomerSaleOtherPayment.setPaymentDate(clientCustomerSaleOtherPaymentDto.getPaymentDate());
        clientCustomerSaleOtherPayment.setPaymentDescription(clientCustomerSaleOtherPaymentDto.getPaymentDescription());
        clientCustomerSaleOtherPayment.setPaymentSettledDate(clientCustomerSaleOtherPaymentDto.getPaymentSettledDate());
        clientCustomerSaleOtherPayment.setPaymentIsSettled(clientCustomerSaleOtherPaymentDto.getPaymentIsSettled());
        clientCustomerSaleOtherPayment.setSaleId(saleTransformer.reverseTransform(clientCustomerSaleOtherPaymentDto.getSaleId()));

        return clientCustomerSaleOtherPayment;
    }
}
