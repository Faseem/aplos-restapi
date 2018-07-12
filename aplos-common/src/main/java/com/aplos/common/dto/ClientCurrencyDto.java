package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientCurrencyDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long clientCurrencyId;
    private ClientDto client;
    private CurrencyDto currency;

    public Long getClientCurrencyId() {
        return clientCurrencyId;
    }

    public void setClientCurrencyId(Long clientCurrencyId) {
        this.clientCurrencyId = clientCurrencyId;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public CurrencyDto getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyDto currency) {
        this.currency = currency;
    }
}
