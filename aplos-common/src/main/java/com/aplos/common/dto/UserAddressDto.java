package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class UserAddressDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long userAddressId;
    private UserDto user;
    private AddressDto address;

    public Long getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Long userAddressId) {
        this.userAddressId = userAddressId;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
