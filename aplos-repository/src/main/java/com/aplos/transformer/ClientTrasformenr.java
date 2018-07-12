package com.aplos.transformer;

import com.aplos.common.dto.AddressDto;
import com.aplos.common.dto.ClientDto;
import com.aplos.domain.Address;
import com.aplos.domain.Client;
import com.aplos.domain.ClientAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class ClientTrasformenr implements BaseTransformer<Client,ClientDto> {

    @Autowired
    AddressTransformer addressTransformer;

    @Autowired
    ClientAddressTransformer clientAddressTransformer;

    @Override
    public ClientDto transform(Client client) {
        ClientDto clientDto = new ClientDto();
        clientDto.setClientId(client.getClientId());
        clientDto.setClientName(client.getClientName());
        clientDto.setClientCreatedDate(client.getClientCreatedDate());
        clientDto.setClientEmail(client.getClientEmail());
        clientDto.setClientIsActive(client.getClientIsActive());
        clientDto.setClientIsCompany(client.getClientIsCompany());
        return clientDto;
    }

    @Override
    public Client reverseTransform(ClientDto clientDto) {
        Client client = new Client();
        client.setClientId(clientDto.getClientId());
        client.setClientCreatedDate(clientDto.getClientCreatedDate());
        client.setClientEmail(clientDto.getClientEmail());
        client.setClientIsActive(clientDto.getClientIsActive());
        client.setClientIsCompany(clientDto.getClientIsCompany());
        client.setClientIsActive(clientDto.getClientIsActive());
        return client;
    }
}
