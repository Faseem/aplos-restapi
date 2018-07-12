package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 04/06/2018.
 */
public class ClientCustomerSaleDto implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long clientCustomerSaleId;
    private ClientDto clientId;
    private CustomerDto customerId;
    private SaleDto saleId;
    private UserDto createdUserId;
    private Date saleDate;
    private Boolean saleIsSettled;

    public Long getClientCustomerSaleId() {
        return clientCustomerSaleId;
    }

    public void setClientCustomerSaleId(Long clientCustomerSaleId) {
        this.clientCustomerSaleId = clientCustomerSaleId;
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

    public SaleDto getSaleId() {
        return saleId;
    }

    public void setSaleId(SaleDto saleId) {
        this.saleId = saleId;
    }

    public UserDto getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(UserDto createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Boolean getSaleIsSettled() {
        return saleIsSettled;
    }

    public void setSaleIsSettled(Boolean saleIsSettled) {
        this.saleIsSettled = saleIsSettled;
    }
}
