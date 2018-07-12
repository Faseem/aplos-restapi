package com.aplos.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 25/04/2018.
 */
@Entity
@Table(name = "user_client_role")
public class UserClientRole implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_client_role_id")
    private Integer userClientRoleId;

    @JoinColumn(name = "client_role_id", referencedColumnName = "client_role_id")
    @ManyToOne(optional = false)
    private ClientRole clientRoleId;

    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User userId;

    @JoinColumn(name = "created_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User createdUserId;

    public Integer getUserClientRoleId() {
        return userClientRoleId;
    }

    public void setUserClientRoleId(Integer userClientRoleId) {
        this.userClientRoleId = userClientRoleId;
    }

    public ClientRole getClientRoleId() {
        return clientRoleId;
    }

    public void setClientRoleId(ClientRole clientRoleId) {
        this.clientRoleId = clientRoleId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public User getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(User createdUserId) {
        this.createdUserId = createdUserId;
    }
}
