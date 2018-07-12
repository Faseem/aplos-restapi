package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by Aux072 on 10/06/2018.
 */
public class ClientCustomerSaleBankPaymentDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long clientCustomerSaleBankPaymentId;
    private ClientDto clientId;
    private CustomerDto customerId;
    private String bankName;
    private SaleDto saleId;
    private UserDto acceptedUserId;
    private Date chequeDate;
    private Date paymentDate;
    private Date paymentSetteledDate;
    private String paymentDescription;
    private String branch;
    private String chequeNumber;
    private Double amount;
    private Boolean paymentIsSettled;

    public Long getClientCustomerSaleBankPaymentId() {
        return clientCustomerSaleBankPaymentId;
    }

    public void setClientCustomerSaleBankPaymentId(Long clientCustomerSaleBankPaymentId) {
        this.clientCustomerSaleBankPaymentId = clientCustomerSaleBankPaymentId;
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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public Date getChequeDate() {
        return chequeDate;
    }

    public void setChequeDate(Date chequeDate) {
        this.chequeDate = chequeDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getPaymentSetteledDate() {
        return paymentSetteledDate;
    }

    public void setPaymentSetteledDate(Date paymentSetteledDate) {
        this.paymentSetteledDate = paymentSetteledDate;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getPaymentIsSettled() {
        return paymentIsSettled;
    }

    public void setPaymentIsSettled(Boolean paymentIsSettled) {
        this.paymentIsSettled = paymentIsSettled;
    }
}
