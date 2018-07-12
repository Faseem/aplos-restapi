package com.aplos.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class CurrencyDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Integer currencyId;
    private String currencyCode;
    private String currencyName;
    private String currencySymbol;
    private List<ClientCurrencyDto> clientCurrencyList;

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

    public List<ClientCurrencyDto> getClientCurrencyList() {
        return clientCurrencyList;
    }

    public void setClientCurrencyList(List<ClientCurrencyDto> clientCurrencyList) {
        this.clientCurrencyList = clientCurrencyList;
    }
}
