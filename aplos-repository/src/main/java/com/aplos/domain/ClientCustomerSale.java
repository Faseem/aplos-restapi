package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 01/06/2018.
 */
@Entity
@Table(name = "client_customer_sale")
public class ClientCustomerSale implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_customer_sale_id")
    private Long clientCustomerSaleId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = false)
    private Client clientId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customerId;

    @JoinColumn(name = "sale_id", referencedColumnName = "sale_id")
    @ManyToOne(optional = false)
    private Sale saleId;

    @JoinColumn(name = "created_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User createdUserId;

    @Column(name = "sale_date")
    @Temporal(TemporalType.DATE)
    private Date saleDate;

    @Column(name = "sale_is_settled")
    private Boolean saleIsSettled;

    public Long getClientCustomerSaleId() {
        return clientCustomerSaleId;
    }

    public void setClientCustomerSaleId(Long clientCustomerSaleId) {
        this.clientCustomerSaleId = clientCustomerSaleId;
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

    public User getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(User createdUserId) {
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
