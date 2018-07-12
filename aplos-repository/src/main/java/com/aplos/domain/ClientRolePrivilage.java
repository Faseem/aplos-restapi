package com.aplos.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "client_role_privilage")
public class ClientRolePrivilage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "client_role_privilage_id")
    private Integer clientRolePrivilageId;

    @Column(name = "client_role_privilage_created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clientRolePrivilageCreatedDate;

    @JoinColumn(name = "client_role_id", referencedColumnName = "client_role_id")
    @ManyToOne(optional = false)
    private ClientRole clientRoleId;

    @JoinColumn(name = "privilage_id", referencedColumnName = "privilage_id")
    @ManyToOne(optional = false)
    private Privilage privilageId;

    @JoinColumn(name = "client_role_privilage_Created_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User clientRolePrivilageCreatedUserId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public ClientRole getClientRoleId() {
        return clientRoleId;
    }

    public void setClientRoleId(ClientRole clientRoleId) {
        this.clientRoleId = clientRoleId;
    }

    public Privilage getPrivilageId() {
        return privilageId;
    }

    public void setPrivilageId(Privilage privilageId) {
        this.privilageId = privilageId;
    }

    public User getClientRolePrivilageCreatedUserId() {
        return clientRolePrivilageCreatedUserId;
    }

    public void setClientRolePrivilageCreatedUserId(User clientRolePrivilageCreatedUserId) {
        this.clientRolePrivilageCreatedUserId = clientRolePrivilageCreatedUserId;
    }
}
