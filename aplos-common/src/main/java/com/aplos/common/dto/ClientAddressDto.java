package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientAddressDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long clientAddressId;
    private ClientDto client;
    private AddressDto address;

    public Long getClientAddressId() {
        return clientAddressId;
    }

    public void setClientAddressId(Long clientAddressId) {
        this.clientAddressId = clientAddressId;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
