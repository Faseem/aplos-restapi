package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long clientId;
    private String clientName;
    private String clientEmail;
    private Boolean clientIsActive;
    private Date clientCreatedDate;
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
