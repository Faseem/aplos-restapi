package com.aplos.transformer;

import com.aplos.common.dto.AddressDto;
import com.aplos.domain.Address;
import com.aplos.domain.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class AddressTransformer implements BaseTransformer<Address, AddressDto> {

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    ClientAddressTransformer clientAddressTransformer;

    @Autowired
    AddressTransformer addressTransformer;

    @Autowired
    UserAddressTransformer userAddressTransformer;

    @Autowired
    CityTransformer cityTransformer;



    @Override
    public AddressDto transform(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setAddressId(address.getAddressId());
        addressDto.setAddressLineOne(address.getAddressLineOne());
        addressDto.setAddressLineTwo(address.getAddressLineTwo());
        addressDto.setAddressLineThree(address.getAddressLineThree());
        addressDto.setAddressPostalCode(address.getAddressPostalCode());
        addressDto.setCityId(cityTransformer.transform(address.getCityId()));
        /*address.getClientAddressList().forEach(clientAddress -> {
            addressDto.getClientAddressList().add(clientAddressTransformer.transform(clientAddress));
        });
        address.getUserAddressList().forEach((usserAdderss) -> {
            addressDto.getUserAddressList().add(userAddressTransformer.transform(usserAdderss));
        });*/
        return addressDto;
    }

    @Override
    public Address reverseTransform(AddressDto addressDto) {
        Address address = new Address();
        address.setAddressId(addressDto.getAddressId());
        address.setAddressLineOne(addressDto.getAddressLineOne());
        address.setAddressLineTwo(addressDto.getAddressLineTwo());
        address.setAddressLineThree(addressDto.getAddressLineThree());
        address.setAddressPostalCode(addressDto.getAddressPostalCode());
        address.setCityId(cityTransformer.reverseTransform(addressDto.getCityId()));
        /*addressDto.getClientAddressList().forEach(clientAddress -> {
            address.getClientAddressList().add(clientAddressTransformer.reverseTransform(clientAddress));
        });
        addressDto.getUserAddressList().forEach((usserAdderss) -> {
            address.getUserAddressList().add(userAddressTransformer.reverseTransform(usserAdderss));
        });*/
        return address;
    }
}
