package com.aplos.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "client_role")
public class ClientRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_role_id")
    private Long clientRoleId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = true)
    private Client client;

    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    @ManyToOne(optional = true)
    private Role role;

    @JoinColumn(name = "client_role_assigned_by_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = true)
    private User clientRoleAssignedByUserId;

    @Column(name = "client_role_assigned_date")
    @Temporal(TemporalType.DATE)
    private Date clientRoleAssignedDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientRoleId")
    private List<ClientRolePrivilage> clientRolePrivilageList;

    public Long getClientRoleId() {
        return clientRoleId;
    }

    public void setClientRoleId(Long clientRoleId) {
        this.clientRoleId = clientRoleId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getClientRoleAssignedByUserId() {
        return clientRoleAssignedByUserId;
    }

    public void setClientRoleAssignedByUserId(User clientRoleAssignedByUserId) {
        this.clientRoleAssignedByUserId = clientRoleAssignedByUserId;
    }

    public List<ClientRolePrivilage> getClientRolePrivilageList() {
        return clientRolePrivilageList;
    }

    public void setClientRolePrivilageList(List<ClientRolePrivilage> clientRolePrivilageList) {
        this.clientRolePrivilageList = clientRolePrivilageList;
    }

    public Date getClientRoleAssignedDate() {
        return clientRoleAssignedDate;
    }

    public void setClientRoleAssignedDate(Date clientRoleAssignedDate) {
        this.clientRoleAssignedDate = clientRoleAssignedDate;
    }
}
