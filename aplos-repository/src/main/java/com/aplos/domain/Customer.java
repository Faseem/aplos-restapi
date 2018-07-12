package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_description")
    private String customerDescription;

    @Column(name = "customer_contact_number_one")
    private String customerContactNumberOne;

    @Column(name = "customer_contact_number_two")
    private String customerContactNumberTwo;

    @Column(name = "customer_email")
    private String customerEmail;


    @JoinColumn(name = "created_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User createdUserId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerDescription() {
        return customerDescription;
    }

    public void setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
    }

    public String getCustomerContactNumberOne() {
        return customerContactNumberOne;
    }

    public void setCustomerContactNumberOne(String customerContactNumberOne) {
        this.customerContactNumberOne = customerContactNumberOne;
    }

    public String getCustomerContactNumberTwo() {
        return customerContactNumberTwo;
    }

    public void setCustomerContactNumberTwo(String customerContactNumberTwo) {
        this.customerContactNumberTwo = customerContactNumberTwo;
    }

    public User getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(User createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
