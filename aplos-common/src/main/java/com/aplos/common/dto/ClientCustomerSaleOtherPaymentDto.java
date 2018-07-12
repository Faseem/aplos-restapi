package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 11/06/2018.
 */
public class ClientCustomerSaleOtherPaymentDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long clientCustomerSaleOtherPaymentId;
    private ClientDto clientId;
    private CustomerDto customerId;
    private SaleDto saleId;
    private UserDto acceptedUserId;
    private Date paymentSettledDate;
    private Date paymentDate;
    private String paymentDescription;
    private Double paymentAmount;
    private Boolean paymentIsSettled;

    public Long getClientCustomerSaleOtherPaymentId() {
        return clientCustomerSaleOtherPaymentId;
    }

    public void setClientCustomerSaleOtherPaymentId(Long clientCustomerSaleOtherPaymentId) {
        this.clientCustomerSaleOtherPaymentId = clientCustomerSaleOtherPaymentId;
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

    public Date getPaymentSettledDate() {
        return paymentSettledDate;
    }

    public void setPaymentSettledDate(Date paymentSettledDate) {
        this.paymentSettledDate = paymentSettledDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Boolean getPaymentIsSettled() {
        return paymentIsSettled;
    }

    public void setPaymentIsSettled(Boolean paymentIsSettled) {
        this.paymentIsSettled = paymentIsSettled;
    }
}
