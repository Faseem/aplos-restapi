package com.aplos.transformer;

import com.aplos.common.dto.ClientRolePrivilageDto;
import com.aplos.domain.ClientRolePrivilage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class ClientRolePrivilageTrasformer implements BaseTransformer<ClientRolePrivilage, ClientRolePrivilageDto> {

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    PrivilageTransformer privilageTransformer;

    @Autowired
    ClientRoleTransformenr clientRoleTransformenr;


    @Override
    public ClientRolePrivilageDto transform(ClientRolePrivilage clientRolePrivilage) {
        ClientRolePrivilageDto clientRolePrivilageDto = new ClientRolePrivilageDto();
        clientRolePrivilageDto.setClientRolePrivilageId(clientRolePrivilage.getClientRolePrivilageId());
        clientRolePrivilageDto.setClientRolePrivilageCreatedUserId(userTransformer.transform
                (clientRolePrivilage.getClientRolePrivilageCreatedUserId()));
        clientRolePrivilageDto.setPrivilageId(privilageTransformer.transform(clientRolePrivilage.getPrivilageId()));
        clientRolePrivilageDto.setClientRolePrivilageCreatedDate(clientRolePrivilage.getClientRolePrivilageCreatedDate());
        clientRolePrivilageDto.setClientRoleId(clientRoleTransformenr.transform(clientRolePrivilage.getClientRoleId()));
        return clientRolePrivilageDto;
    }

    @Override
    public ClientRolePrivilage reverseTransform(ClientRolePrivilageDto clientRolePrivilageDto) {
        ClientRolePrivilage clientRolePrivilage = new ClientRolePrivilage();
        clientRolePrivilage.setClientRolePrivilageId(clientRolePrivilageDto.getClientRolePrivilageId());
        clientRolePrivilage.setClientRolePrivilageCreatedUserId(userTransformer.reverseTransform(
                (clientRolePrivilageDto.getClientRolePrivilageCreatedUserId())));
        clientRolePrivilage.setPrivilageId(privilageTransformer.reverseTransform(clientRolePrivilageDto.getPrivilageId()));
        clientRolePrivilage.setClientRolePrivilageCreatedDate(clientRolePrivilageDto.getClientRolePrivilageCreatedDate());
        clientRolePrivilage.setClientRoleId(clientRoleTransformenr.reverseTransform(clientRolePrivilageDto.getClientRoleId()));
        return clientRolePrivilage;
    }
}
