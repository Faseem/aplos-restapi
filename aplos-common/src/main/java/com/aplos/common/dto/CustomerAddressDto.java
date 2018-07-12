package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
public class CustomerAddressDto implements Serializable {

    private static final long serialVersionUID = 5820008157862853492L;

    private Long customerAddressId;

    private AddressDto addressId;

    private CustomerDto customerId;

    public Long getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(Long customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public AddressDto getAddressId() {
        return addressId;
    }

    public void setAddressId(AddressDto addressId) {
        this.addressId = addressId;
    }

    public CustomerDto getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerDto customerId) {
        this.customerId = customerId;
    }
}
