package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 10/06/2018.
 */
public class ClientCustomerSaleCachePaymentDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long clientCustomerSaleCachePaymentId;
    private ClientDto clientId;
    private CustomerDto customerId;
    private SaleDto saleId;
    private UserDto acceptedUserId;
    private Date paymentDate;
    private String description;
    private Double amount;

    public Long getClientCustomerSaleCachePaymentId() {
        return clientCustomerSaleCachePaymentId;
    }

    public void setClientCustomerSaleCachePaymentId(Long clientCustomerSaleCachePaymentId) {
        this.clientCustomerSaleCachePaymentId = clientCustomerSaleCachePaymentId;
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

    public UserDto getAcceptedUserId() {
        return acceptedUserId;
    }

    public void setAcceptedUserId(UserDto acceptedUserId) {
        this.acceptedUserId = acceptedUserId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
