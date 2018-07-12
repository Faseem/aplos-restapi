package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
public class ClientCustomerDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long clientCustomerId;

    private ClientDto clientId;

    private CustomerDto customerId;

    public Long getClientCustomerId() {
        return clientCustomerId;
    }

    public void setClientCustomerId(Long clientCustomerId) {
        this.clientCustomerId = clientCustomerId;
    }

    public ClientDto getClientId() {
        return clientId;
    }

    public void setClientId(ClientDto clientId) {
        this.clientId = clientId;
    }

    public CustomerDto getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerDto customerId) {
        this.customerId = customerId;
    }
}
