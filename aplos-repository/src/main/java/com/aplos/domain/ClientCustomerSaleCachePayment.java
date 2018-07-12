package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 10/06/2018.
 */
@Entity
@Table(name = "client_customer_sale_cache_payment")
public class ClientCustomerSaleCachePayment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_customer_sale_cache_payment_id")
    private Long clientCustomerSaleCachePaymentId;

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

    @Column(name = "payment_date")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private Double amount;

    public Long getClientCustomerSaleCachePaymentId() {
        return clientCustomerSaleCachePaymentId;
    }

    public void setClientCustomerSaleCachePaymentId(Long clientCustomerSaleCachePaymentId) {
        this.clientCustomerSaleCachePaymentId = clientCustomerSaleCachePaymentId;
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
