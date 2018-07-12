package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 10/06/2018.
 */
@Entity
@Table(name = "client_bank")
public class ClientBank implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_bank_id", nullable = false)
    private Long clientBankId;

    @JoinColumn(name = "bank_id",  referencedColumnName = "bank_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Bank bankId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Client clientId;

    @JoinColumn(name = "added_user_id", referencedColumnName = "user_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private User addedUserId;

    @Column(name = "assigned_date")
    @Temporal(TemporalType.DATE)
    private Date assignedDate;

    public Long getClientBankId() {
        return clientBankId;
    }

    public void setClientBankId(Long clientBankId) {
        this.clientBankId = clientBankId;
    }

    public Bank getBankId() {
        return bankId;
    }

    public void setBankId(Bank bankId) {
        this.bankId = bankId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public User getAddedUserId() {
        return addedUserId;
    }

    public void setAddedUserId(User addedUserId) {
        this.addedUserId = addedUserId;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }
}
