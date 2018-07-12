package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientCountryDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long clientCountryId;
    private ClientDto client;
    private CountryDto country;

    public Long getClientCountryId() {
        return clientCountryId;
    }

    public void setClientCountryId(Long clientCountryId) {
        this.clientCountryId = clientCountryId;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }
}
