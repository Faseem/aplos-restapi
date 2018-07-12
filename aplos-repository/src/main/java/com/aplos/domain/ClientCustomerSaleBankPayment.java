package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 10/06/2018.
 */
@Entity
@Table(name = "client_customer_sale_bank_payment")
public class ClientCustomerSaleBankPayment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_customer_sale_bank_payment_id")
    private Long clientCustomerSaleBankPaymentId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = false)
    private Client clientId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customerId;

    @JoinColumn(name = "sale_id", referencedColumnName = "sale_id")
    @ManyToOne(optional = false)
    private Sale saleId;

    @JoinColumn(name = "accepted_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User acceptedUserId;

    @Column(name = "cheque_date")
    @Temporal(TemporalType.DATE)
    private Date chequeDate;

    @Column(name = "payment_date")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @Column(name = "payment_setteled_date")
    @Temporal(TemporalType.DATE)
    private Date paymentSetteledDate;

    @Column(name = "bank_name")
    private String bankName;


    @Column(name = "payment_description")
    private String paymentDescription;

    @Column(name = "branch")
    private String branch;

    @Column(name = "cheque_number")
    private String chequeNumber;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "payment_is_settled")
    private Boolean paymentIsSettled;


    public Long getClientCustomerSaleBankPaymentId() {
        return clientCustomerSaleBankPaymentId;
    }

    public void setClientCustomerSaleBankPaymentId(Long clientCustomerSaleBankPaymentId) {
        this.clientCustomerSaleBankPaymentId = clientCustomerSaleBankPaymentId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Sale getSaleId() {
        return saleId;
    }

    public void setSaleId(Sale saleId) {
        this.saleId = saleId;
    }

    public User getAcceptedUserId() {
        return acceptedUserId;
    }

    public void setAcceptedUserId(User acceptedUserId) {
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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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
