package com.aplos.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_email")
    private String clientEmail;

    @Column(name = "client_is_active")
    private Boolean clientIsActive;

    @Column(name = "client_created_date")
    @Temporal(TemporalType.DATE)
    private Date clientCreatedDate;

    @Column(name = "client_is_company")
    private Boolean clientIsCompany;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Boolean getClientIsActive() {
        return clientIsActive;
    }

    public void setClientIsActive(Boolean clientIsActive) {
        this.clientIsActive = clientIsActive;
    }

    public Date getClientCreatedDate() {
        return clientCreatedDate;
    }

    public void setClientCreatedDate(Date clientCreatedDate) {
        this.clientCreatedDate = clientCreatedDate;
    }

    public Boolean getClientIsCompany() {
        return clientIsCompany;
    }

    public void setClientIsCompany(Boolean clientIsCompany) {
        this.clientIsCompany = clientIsCompany;
    }


}
