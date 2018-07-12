package com.aplos.service;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 14/05/2018.
 */
public interface CustomerAddressService {
    public ResponseDto addCustomerAddress(CustomerAddressDto customerAddressDto);
    public ResponseDto getCustomerAddressCountByCityId(Long cityId);
}
