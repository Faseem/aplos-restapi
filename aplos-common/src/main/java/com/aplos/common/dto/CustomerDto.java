package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
public class CustomerDto implements Serializable {

    private static final long serialVersionUID = 5820008157862853492L;

    private Long customerId;

    private String customerName;

    private String customerDescription;

    private String customerContactNumberOne;

    private String customerContactNumberTwo;

    private UserDto createdUserId;

    private String customerEmail;

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

    public UserDto getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(UserDto createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
