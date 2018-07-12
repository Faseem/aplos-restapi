package com.aplos.transformer;

import com.aplos.common.dto.ClientRoleDto;
import com.aplos.domain.ClientRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class ClientRoleTransformenr implements BaseTransformer <ClientRole, ClientRoleDto> {

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    RoleTransformer roleTransformer;

    @Autowired
    ClientRolePrivilageTrasformer clientRolePrivilageTrasformer;

    @Override
    public ClientRoleDto transform(ClientRole clientRole) {
        ClientRoleDto clientRoleDto = new ClientRoleDto();
        clientRoleDto.setClient(clientTrasformenr.transform(clientRole.getClient()));
        clientRoleDto.setClientRoleAssignedDate(clientRole.getClientRoleAssignedDate());
        clientRoleDto.setClientRoleId(clientRole.getClientRoleId());
        clientRoleDto.setClientRoleAssignedByUserId(userTransformer.transform(clientRole.getClientRoleAssignedByUserId()));
        clientRoleDto.setRole(roleTransformer.transform(clientRole.getRole()));
        clientRole.getClientRolePrivilageList().forEach(clientRolePrivilage -> {
            clientRoleDto.getClientRolePrivilageList().add(clientRolePrivilageTrasformer.transform(clientRolePrivilage));
        } );
        return clientRoleDto;
    }

    @Override
    public ClientRole reverseTransform(ClientRoleDto type) {
        return null;
    }
}
