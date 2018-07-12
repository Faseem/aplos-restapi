package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 11/06/2018.
 */
@Entity
@Table(name = "client_customer_sale_other_payment")
public class ClientCustomerSaleOtherPayment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_customer_sale_other_payment_id")
    private Long clientCustomerSaleOtherPaymentId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = false)
    private Client clientId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customerId;

    @JoinColumn(name = "sale_id", referencedColumnName = "sale_id")
    @ManyToOne(optional = false)
    private Sale saleId;

    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User acceptedUserId;

    @Column(name = "payment_settled_date")
    @Temporal(TemporalType.DATE)
    private Date paymentSettledDate;

    @Column(name = "payment_date")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @Column(name = "payment_is_settled")
    private Boolean paymentIsSettled;

    @Column(name = "payment_description")
    private String paymentDescription;

    @Column(name = "payment_amount")
    private Double paymentAmount;

    public Long getClientCustomerSaleOtherPaymentId() {
        return clientCustomerSaleOtherPaymentId;
    }

    public void setClientCustomerSaleOtherPaymentId(Long clientCustomerSaleOtherPaymentId) {
        this.clientCustomerSaleOtherPaymentId = clientCustomerSaleOtherPaymentId;
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

    public Boolean getPaymentIsSettled() {
        return paymentIsSettled;
    }

    public void setPaymentIsSettled(Boolean paymentIsSettled) {
        this.paymentIsSettled = paymentIsSettled;
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
}
