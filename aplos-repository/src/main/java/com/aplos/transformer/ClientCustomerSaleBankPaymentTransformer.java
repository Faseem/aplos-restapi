package com.aplos.transformer;

import com.aplos.common.dto.ClientCustomerSaleBankPaymentDto;
import com.aplos.domain.ClientCustomerSaleBankPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 11/06/2018.
 */
@Service
public class ClientCustomerSaleBankPaymentTransformer implements BaseTransformer<ClientCustomerSaleBankPayment, ClientCustomerSaleBankPaymentDto>{

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    CustomerTransformer customerTransformer;

    @Autowired
    SaleTransformer saleTransformer;

    @Autowired
    BankTransformer bankTransformer;

    @Override
    public ClientCustomerSaleBankPaymentDto transform(ClientCustomerSaleBankPayment clientCustomerSaleBankPayment) {
        ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto = new ClientCustomerSaleBankPaymentDto();
        clientCustomerSaleBankPaymentDto.setClientId(clientTrasformenr.transform(clientCustomerSaleBankPayment.getClientId()));
        clientCustomerSaleBankPaymentDto.setAcceptedUserId(userTransformer.transform(clientCustomerSaleBankPayment.getAcceptedUserId()));
        clientCustomerSaleBankPaymentDto.setClientCustomerSaleBankPaymentId(clientCustomerSaleBankPayment.getClientCustomerSaleBankPaymentId());
        clientCustomerSaleBankPaymentDto.setCustomerId(customerTransformer.transform(clientCustomerSaleBankPayment.getCustomerId()));
        clientCustomerSaleBankPaymentDto.setAmount(clientCustomerSaleBankPayment.getAmount());
        clientCustomerSaleBankPaymentDto.setPaymentDate(clientCustomerSaleBankPayment.getPaymentDate());
        clientCustomerSaleBankPaymentDto.setPaymentDescription(clientCustomerSaleBankPayment.getPaymentDescription());
        clientCustomerSaleBankPaymentDto.setPaymentSetteledDate(clientCustomerSaleBankPayment.getPaymentSetteledDate());
        clientCustomerSaleBankPaymentDto.setSaleId(saleTransformer.transform(clientCustomerSaleBankPayment.getSaleId()));
        clientCustomerSaleBankPaymentDto.setBankName(clientCustomerSaleBankPayment.getBankName());
        clientCustomerSaleBankPaymentDto.setBranch(clientCustomerSaleBankPayment.getBranch());
        clientCustomerSaleBankPaymentDto.setChequeDate(clientCustomerSaleBankPayment.getChequeDate());
        clientCustomerSaleBankPaymentDto.setChequeNumber(clientCustomerSaleBankPayment.getChequeNumber());
        clientCustomerSaleBankPaymentDto.setPaymentIsSettled(clientCustomerSaleBankPayment.getPaymentIsSettled());

        return clientCustomerSaleBankPaymentDto;
    }

    @Override
    public ClientCustomerSaleBankPayment reverseTransform(ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto) {
        ClientCustomerSaleBankPayment clientCustomerSaleBankPayment = new ClientCustomerSaleBankPayment();
        clientCustomerSaleBankPayment.setClientId(clientTrasformenr.reverseTransform(clientCustomerSaleBankPaymentDto.getClientId()));
        clientCustomerSaleBankPayment.setAcceptedUserId(userTransformer.reverseTransform(clientCustomerSaleBankPaymentDto.getAcceptedUserId()));
        clientCustomerSaleBankPayment.setClientCustomerSaleBankPaymentId(clientCustomerSaleBankPaymentDto.getClientCustomerSaleBankPaymentId());
        clientCustomerSaleBankPayment.setCustomerId(customerTransformer.reverseTransform(clientCustomerSaleBankPaymentDto.getCustomerId()));
        clientCustomerSaleBankPayment.setAmount(clientCustomerSaleBankPaymentDto.getAmount());
        clientCustomerSaleBankPayment.setPaymentDate(clientCustomerSaleBankPaymentDto.getPaymentDate());
        clientCustomerSaleBankPayment.setPaymentDescription(clientCustomerSaleBankPaymentDto.getPaymentDescription());
        clientCustomerSaleBankPayment.setPaymentSetteledDate(clientCustomerSaleBankPaymentDto.getPaymentSetteledDate());
        clientCustomerSaleBankPayment.setSaleId(saleTransformer.reverseTransform(clientCustomerSaleBankPaymentDto.getSaleId()));
        clientCustomerSaleBankPayment.setBankName(clientCustomerSaleBankPaymentDto.getBankName());
        clientCustomerSaleBankPayment.setBranch(clientCustomerSaleBankPaymentDto.getBranch());
        clientCustomerSaleBankPayment.setChequeDate(clientCustomerSaleBankPaymentDto.getChequeDate());
        clientCustomerSaleBankPayment.setChequeNumber(clientCustomerSaleBankPaymentDto.getChequeNumber());
        clientCustomerSaleBankPayment.setPaymentIsSettled(clientCustomerSaleBankPaymentDto.getPaymentIsSettled());

        return clientCustomerSaleBankPayment;
    }
}
