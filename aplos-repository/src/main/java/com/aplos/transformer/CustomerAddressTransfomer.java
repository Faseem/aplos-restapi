package com.aplos.transformer;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.domain.CustomerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 14/05/2018.
 */
@Service
public class CustomerAddressTransfomer implements BaseTransformer<CustomerAddress,CustomerAddressDto>{

    @Autowired
    CustomerTransformer customerTransformer;

    @Autowired
    AddressTransformer addressTransformer;

    @Override
    public CustomerAddressDto transform(CustomerAddress customerAddress) {
        CustomerAddressDto customerAddressDto = new CustomerAddressDto();
        customerAddressDto.setCustomerAddressId(customerAddress.getCustomerAddressId());
        customerAddressDto.setCustomerId(customerTransformer.transform(customerAddress.getCustomerId()));
        customerAddressDto.setAddressId(addressTransformer.transform(customerAddress.getAddressId()));

        return customerAddressDto;
    }

    @Override
    public CustomerAddress reverseTransform(CustomerAddressDto customerAddressDto) {
        CustomerAddress customerAddress = new CustomerAddress();
        customerAddress.setCustomerAddressId(customerAddressDto.getCustomerAddressId());
        customerAddress.setCustomerId(customerTransformer.reverseTransform(customerAddressDto.getCustomerId()));
        customerAddress.setAddressId(addressTransformer.reverseTransform(customerAddressDto.getAddressId()));

        return customerAddress;
    }
}
