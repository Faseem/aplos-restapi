package com.aplos.transformer;

import com.aplos.common.dto.ClientCustomerDto;
import com.aplos.domain.ClientCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class ClientCustomerTransformer implements BaseTransformer<ClientCustomer, ClientCustomerDto>  {

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    CustomerTransformer customerTransformer;

    @Override
    public ClientCustomerDto transform(ClientCustomer clientCustomer) {
        ClientCustomerDto clientCustomerDto = new ClientCustomerDto();
        clientCustomerDto.setClientCustomerId(clientCustomer.getClientCustomerId());
        clientCustomerDto.setClientId(clientTrasformenr.transform(clientCustomer.getClientId()));
        clientCustomerDto.setCustomerId(customerTransformer.transform(clientCustomer.getCustomerId()));
        return clientCustomerDto;
    }

    @Override
    public ClientCustomer reverseTransform(ClientCustomerDto clientCustomerDto) {
        ClientCustomer clientCustomer = new ClientCustomer();
        clientCustomer.setClientCustomerId(clientCustomerDto.getClientCustomerId());
        clientCustomer.setClientId(clientTrasformenr.reverseTransform(clientCustomerDto.getClientId()));
        clientCustomer.setCustomerId(customerTransformer.reverseTransform(clientCustomerDto.getCustomerId()));
        return clientCustomer;
    }
}
