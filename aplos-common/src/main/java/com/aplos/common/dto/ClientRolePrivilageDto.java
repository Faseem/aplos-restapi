package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientRolePrivilageDto implements Serializable {

    private static final long serialVersionUID = 5820008157862853492L;

    private Integer clientRolePrivilageId;
    private Date clientRolePrivilageCreatedDate;
    private ClientRoleDto clientRoleId;
    private PrivilageDto privilageId;
    private UserDto clientRolePrivilageCreatedUserId;

    public Integer getClientRolePrivilageId() {
        return clientRolePrivilageId;
    }

    public void setClientRolePrivilageId(Integer clientRolePrivilageId) {
        this.clientRolePrivilageId = clientRolePrivilageId;
    }

    public Date getClientRolePrivilageCreatedDate() {
        return clientRolePrivilageCreatedDate;
    }

    public void setClientRolePrivilageCreatedDate(Date clientRolePrivilageCreatedDate) {
        this.clientRolePrivilageCreatedDate = clientRolePrivilageCreatedDate;
    }

    public ClientRoleDto getClientRoleId() {
        return clientRoleId;
    }

    public void setClientRoleId(ClientRoleDto clientRoleId) {
        this.clientRoleId = clientRoleId;
    }

    public PrivilageDto getPrivilageId() {
        return privilageId;
    }

    public void setPrivilageId(PrivilageDto privilageId) {
        this.privilageId = privilageId;
    }

    public UserDto getClientRolePrivilageCreatedUserId() {
        return clientRolePrivilageCreatedUserId;
    }

    public void setClientRolePrivilageCreatedUserId(UserDto clientRolePrivilageCreatedUserId) {
        this.clientRolePrivilageCreatedUserId = clientRolePrivilageCreatedUserId;
    }
}
