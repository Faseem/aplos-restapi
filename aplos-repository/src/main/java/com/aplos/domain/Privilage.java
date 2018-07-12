package com.aplos.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "privilage")
public class Privilage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "privilage_id")
    private Long privilageId;

    @Column(name = "privilage_description")
    private String privilageDescription;

    @Column(name = "privilage_code")
    private String privilageCode;

    @Column(name = "privilage_name")
    private String privilageName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "privilageId")
    private List<ClientRolePrivilage> clientRolePrivilageList;

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

    public List<ClientRolePrivilage> getClientRolePrivilageList() {
        return clientRolePrivilageList;
    }

    public void setClientRolePrivilageList(List<ClientRolePrivilage> clientRolePrivilageList) {
        this.clientRolePrivilageList = clientRolePrivilageList;
    }
}
