package com.aplos.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class RoleDto implements Serializable {
    private static final long serialVersionUID = 6953978110388779136L;

    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private List<ClientRoleDto> clientRoleList;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public List<ClientRoleDto> getClientRoleList() {
        return clientRoleList;
    }

    public void setClientRoleList(List<ClientRoleDto> clientRoleList) {
        this.clientRoleList = clientRoleList;
    }
}
