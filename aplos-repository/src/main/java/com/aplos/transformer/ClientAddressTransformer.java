package com.aplos.transformer;

import com.aplos.common.dto.ClientAddressDto;
import com.aplos.domain.Client;
import com.aplos.domain.ClientAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class ClientAddressTransformer implements BaseTransformer<ClientAddress, ClientAddressDto> {

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    AddressTransformer addressTransformer;

    @Override
    public ClientAddressDto transform(ClientAddress clientAddress) {
        ClientAddressDto clientAddressDto = new ClientAddressDto();
        clientAddressDto.setClient(clientTrasformenr.transform(clientAddress.getClient()));
        clientAddressDto.setAddress(addressTransformer.transform(clientAddress.getAddress()));
        clientAddressDto.setClientAddressId(clientAddress.getClientAddressId());
        return  clientAddressDto;
    }

    @Override
    public ClientAddress reverseTransform(ClientAddressDto clientAddressDto) {
        ClientAddress clientAddress = new ClientAddress();
        clientAddress.setClient(clientTrasformenr.reverseTransform(clientAddressDto.getClient()));
        clientAddress.setAddress(addressTransformer.reverseTransform(clientAddressDto.getAddress()));
        clientAddress.setClientAddressId(clientAddressDto.getClientAddressId());
        return  clientAddress;
    }
}
