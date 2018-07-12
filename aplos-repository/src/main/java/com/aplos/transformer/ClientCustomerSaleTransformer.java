package com.aplos.transformer;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.domain.ClientCustomerSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Service
public class ClientCustomerSaleTransformer implements BaseTransformer<ClientCustomerSale, ClientCustomerSaleDto> {

    @Autowired
    CustomerTransformer customerTransformer;

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    SaleTransformer saleTransformer;

    @Override
    public ClientCustomerSaleDto transform(ClientCustomerSale clientCustomerSale) {
        ClientCustomerSaleDto clientCustomerSaleDto = new ClientCustomerSaleDto();
        clientCustomerSaleDto.setClientCustomerSaleId(clientCustomerSale.getClientCustomerSaleId());
        clientCustomerSaleDto.setCustomerId(customerTransformer.transform(clientCustomerSale.getCustomerId()));
        clientCustomerSaleDto.setClientId(clientTrasformenr.transform(clientCustomerSale.getClientId()));
        clientCustomerSaleDto.setCreatedUserId(userTransformer.transform(clientCustomerSale.getCreatedUserId()));
        clientCustomerSaleDto.setSaleId(saleTransformer.transform(clientCustomerSale.getSaleId()));
        clientCustomerSaleDto.setSaleIsSettled(clientCustomerSale.getSaleIsSettled());
        clientCustomerSaleDto.setSaleDate(clientCustomerSale.getSaleDate());
        return clientCustomerSaleDto;
    }

    @Override
    public ClientCustomerSale reverseTransform(ClientCustomerSaleDto clientCustomerSaleDto) {
        ClientCustomerSale clientCustomerSale = new ClientCustomerSale();
        clientCustomerSale.setClientCustomerSaleId(clientCustomerSaleDto.getClientCustomerSaleId());
        clientCustomerSale.setCustomerId(customerTransformer.reverseTransform(clientCustomerSaleDto.getCustomerId()));
        clientCustomerSale.setClientId(clientTrasformenr.reverseTransform(clientCustomerSaleDto.getClientId()));
        clientCustomerSale.setCreatedUserId(userTransformer.reverseTransform(clientCustomerSaleDto.getCreatedUserId()));
        clientCustomerSale.setSaleId(saleTransformer.reverseTransform(clientCustomerSaleDto.getSaleId()));
        clientCustomerSale.setSaleIsSettled(clientCustomerSaleDto.getSaleIsSettled());
        clientCustomerSale.setSaleDate(clientCustomerSaleDto.getSaleDate());
        return clientCustomerSale;
    }
}
