package com.aplos.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "currency")
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id")
    private Integer currencyId;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "currency_name")
    private String currencyName;

    @Column(name = "currency_symbol")
    private String currencySymbol;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientCurrencyId")
    private List<ClientCurrency> clientCurrencyList;

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public List<ClientCurrency> getClientCurrencyList() {
        return clientCurrencyList;
    }

    public void setClientCurrencyList(List<ClientCurrency> clientCurrencyList) {
        this.clientCurrencyList = clientCurrencyList;
    }
}
