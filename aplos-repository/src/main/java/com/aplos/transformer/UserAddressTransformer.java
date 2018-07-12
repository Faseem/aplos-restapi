package com.aplos.transformer;

import com.aplos.common.dto.UserAddressDto;
import com.aplos.domain.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class UserAddressTransformer implements BaseTransformer<UserAddress, UserAddressDto> {

    @Autowired
    AddressTransformer addressTransformer;

    @Autowired
    UserTransformer userTransformer;

    @Override
    public UserAddressDto transform(UserAddress userAddress) {
        UserAddressDto userAddressDto = new UserAddressDto();
        userAddressDto.setAddress(addressTransformer.transform(userAddress.getAddress()));
        userAddressDto.setUser(userTransformer.transform(userAddress.getUser()));
        userAddressDto.setUserAddressId(userAddress.getUserAddressId());
        return userAddressDto;
    }

    @Override
    public UserAddress reverseTransform(UserAddressDto userAddressDto) {
        UserAddress userAddress = new UserAddress();
        userAddress.setAddress(addressTransformer.reverseTransform(userAddressDto.getAddress()));
        userAddress.setUser(userTransformer.reverseTransform(userAddressDto.getUser()));
        userAddress.setUserAddressId(userAddressDto.getUserAddressId());
        return userAddress;
    }
}
