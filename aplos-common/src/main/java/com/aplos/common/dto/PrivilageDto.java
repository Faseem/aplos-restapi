package com.aplos.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class PrivilageDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long privilageId;
    private String privilageDescription;
    private String privilageCode;
    private String privilageName;
    private List<ClientRolePrivilageDto> clientRolePrivilageList;

    public Long getPrivilageId() {
        return privilageId;
    }

    public void setPrivilageId(Long privilageId) {
        this.privilageId = privilageId;
    }

    public String getPrivilageDescription() {
        return privilageDescription;
    }

    public void setPrivilageDescription(String privilageDescription) {
        this.privilageDescription = privilageDescription;
    }

    public String getPrivilageCode() {
        return privilageCode;
    }

    public void setPrivilageCode(String privilageCode) {
        this.privilageCode = privilageCode;
    }

    public String getPrivilageName() {
        return privilageName;
    }

    public void setPrivilageName(String privilageName) {
        this.privilageName = privilageName;
    }

    public List<ClientRolePrivilageDto> getClientRolePrivilageList() {
        return clientRolePrivilageList;
    }

    public void setClientRolePrivilageList(List<ClientRolePrivilageDto> clientRolePrivilageList) {
        this.clientRolePrivilageList = clientRolePrivilageList;
    }
}
