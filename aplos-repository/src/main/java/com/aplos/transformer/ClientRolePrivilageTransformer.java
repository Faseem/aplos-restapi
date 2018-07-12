package com.aplos.transformer;

import com.aplos.common.dto.ClientRolePrivilageDto;
import com.aplos.domain.ClientRolePrivilage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class ClientRolePrivilageTransformer implements BaseTransformer<ClientRolePrivilage, ClientRolePrivilageDto> {

    @Autowired
    ClientRoleTransformenr clientRoleTransformenr;

    @Autowired
    PrivilageTransformer privilageTransformer;

    @Override
    public ClientRolePrivilageDto transform(ClientRolePrivilage clientRolePrivilage) {
        ClientRolePrivilageDto clientRolePrivilageDto = new ClientRolePrivilageDto();
        clientRolePrivilageDto.setClientRolePrivilageId(clientRolePrivilage.getClientRolePrivilageId());
        clientRolePrivilageDto.setClientRolePrivilageCreatedDate(clientRolePrivilage.getClientRolePrivilageCreatedDate());
        clientRolePrivilageDto.setClientRoleId(clientRoleTransformenr.transform(clientRolePrivilage.getClientRoleId()));
        clientRolePrivilageDto.setPrivilageId(privilageTransformer.transform(clientRolePrivilage.getPrivilageId()));
        return clientRolePrivilageDto;
    }

    @Override
    public ClientRolePrivilage reverseTransform(ClientRolePrivilageDto clientRolePrivilageDto) {
        ClientRolePrivilage clientRolePrivilage = new ClientRolePrivilage();
        clientRolePrivilage.setClientRolePrivilageId(clientRolePrivilageDto.getClientRolePrivilageId());
        clientRolePrivilage.setClientRolePrivilageCreatedDate(clientRolePrivilageDto.getClientRolePrivilageCreatedDate());
        clientRolePrivilage.setClientRoleId(clientRoleTransformenr.reverseTransform(clientRolePrivilageDto.getClientRoleId()));
        clientRolePrivilage.setPrivilageId(privilageTransformer.reverseTransform(clientRolePrivilageDto.getPrivilageId()));
        return clientRolePrivilage;
    }
}
