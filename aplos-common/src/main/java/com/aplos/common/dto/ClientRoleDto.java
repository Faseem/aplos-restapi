package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientRoleDto implements Serializable {

    private static final long serialVersionUID = 5820008157862853492L;

    private Long clientRoleId;
    private ClientDto client;
    private RoleDto role;
    private UserDto clientRoleAssignedByUserId;
    private Date clientRoleAssignedDate;
    private List<ClientRolePrivilageDto> clientRolePrivilageList;

    public Long getClientRoleId() {
        return clientRoleId;
    }

    public void setClientRoleId(Long clientRoleId) {
        this.clientRoleId = clientRoleId;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }

    public UserDto getClientRoleAssignedByUserId() {
        return clientRoleAssignedByUserId;
    }

    public void setClientRoleAssignedByUserId(UserDto clientRoleAssignedByUserId) {
        this.clientRoleAssignedByUserId = clientRoleAssignedByUserId;
    }

    public Date getClientRoleAssignedDate() {
        return clientRoleAssignedDate;
    }

    public void setClientRoleAssignedDate(Date clientRoleAssignedDate) {
        this.clientRoleAssignedDate = clientRoleAssignedDate;
    }

    public List<ClientRolePrivilageDto> getClientRolePrivilageList() {
        return clientRolePrivilageList;
    }

    public void setClientRolePrivilageList(List<ClientRolePrivilageDto> clientRolePrivilageList) {
        this.clientRolePrivilageList = clientRolePrivilageList;
    }
}
