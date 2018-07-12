package com.aplos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "client_currency")
public class ClientCurrency {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_currency_id")
    private Long clientCurrencyId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = true)
    private Client client;

    @JoinColumn(name = "currency_id", referencedColumnName = "currency_id")
    @ManyToOne(optional = true)
    private Currency currency;

    public Long getClientCurrencyId() {
        return clientCurrencyId;
    }

    public void setClientCurrencyId(Long clientCurrencyId) {
        this.clientCurrencyId = clientCurrencyId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
