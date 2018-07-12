package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
@Entity
@Table(name = "customer_address")
public class CustomerAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_address_id")
    private Long customerAddressId;

    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Address addressId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Customer customerId;

    public Long getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(Long customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
}
