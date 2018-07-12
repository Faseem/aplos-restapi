package com.aplos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Created by Aux072 on 06/05/2018.
 */
@Entity
@Table(name = "client_customer")
public class ClientCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_customer_id")
    private Long clientCustomerId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = false)
    private Client clientId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Customer customerId;

    public Long getClientCustomerId() {
        return clientCustomerId;
    }

    public void setClientCustomerId(Long clientCustomerId) {
        this.clientCustomerId = clientCustomerId;
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
}
