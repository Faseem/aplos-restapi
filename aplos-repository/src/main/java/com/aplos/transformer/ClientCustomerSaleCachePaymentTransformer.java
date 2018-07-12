package com.aplos.transformer;

import com.aplos.common.dto.ClientCustomerSaleCachePaymentDto;
import com.aplos.domain.ClientCustomerSaleCachePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 11/06/2018.
 */
@Service
public class ClientCustomerSaleCachePaymentTransformer implements BaseTransformer<ClientCustomerSaleCachePayment, ClientCustomerSaleCachePaymentDto> {

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    CustomerTransformer customerTransformer;

    @Autowired
    SaleTransformer saleTransformer;

    @Override
    public ClientCustomerSaleCachePaymentDto transform(ClientCustomerSaleCachePayment clientCustomerSaleCachePayment) {
        ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDto = new ClientCustomerSaleCachePaymentDto();
        clientCustomerSaleCachePaymentDto.setClientId(clientTrasformenr.transform(clientCustomerSaleCachePayment.getClientId()));
        clientCustomerSaleCachePaymentDto.setAcceptedUserId(userTransformer.transform(clientCustomerSaleCachePayment.getAcceptedUserId()));
        clientCustomerSaleCachePaymentDto.setClientCustomerSaleCachePaymentId(clientCustomerSaleCachePayment.getClientCustomerSaleCachePaymentId());
        clientCustomerSaleCachePaymentDto.setCustomerId(customerTransformer.transform(clientCustomerSaleCachePayment.getCustomerId()));
        clientCustomerSaleCachePaymentDto.setAmount(clientCustomerSaleCachePayment.getAmount());
        clientCustomerSaleCachePaymentDto.setPaymentDate(clientCustomerSaleCachePayment.getPaymentDate());
        clientCustomerSaleCachePaymentDto.setDescription(clientCustomerSaleCachePayment.getDescription());
        clientCustomerSaleCachePaymentDto.setSaleId(saleTransformer.transform(clientCustomerSaleCachePayment.getSaleId()));

        return clientCustomerSaleCachePaymentDto;
    }

    @Override
    public ClientCustomerSaleCachePayment reverseTransform(ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDto) {
        ClientCustomerSaleCachePayment clientCustomerSaleCachePayment = new ClientCustomerSaleCachePayment();
        clientCustomerSaleCachePayment.setClientId(clientTrasformenr.reverseTransform(clientCustomerSaleCachePaymentDto.getClientId()));
        clientCustomerSaleCachePayment.setAcceptedUserId(userTransformer.reverseTransform(clientCustomerSaleCachePaymentDto.getAcceptedUserId()));
        clientCustomerSaleCachePayment.setClientCustomerSaleCachePaymentId(clientCustomerSaleCachePaymentDto.getClientCustomerSaleCachePaymentId());
        clientCustomerSaleCachePayment.setCustomerId(customerTransformer.reverseTransform(clientCustomerSaleCachePaymentDto.getCustomerId()));
        clientCustomerSaleCachePayment.setAmount(clientCustomerSaleCachePaymentDto.getAmount());
        clientCustomerSaleCachePayment.setPaymentDate(clientCustomerSaleCachePaymentDto.getPaymentDate());
        clientCustomerSaleCachePayment.setDescription(clientCustomerSaleCachePaymentDto.getDescription());
        clientCustomerSaleCachePayment.setSaleId(saleTransformer.reverseTransform(clientCustomerSaleCachePaymentDto.getSaleId()));

        return clientCustomerSaleCachePayment;
    }
}
