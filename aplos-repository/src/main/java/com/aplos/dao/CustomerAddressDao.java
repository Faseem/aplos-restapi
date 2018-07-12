package com.aplos.dao;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.domain.CustomerAddress;

import java.util.List;

/**
 * Created by Aux072 on 14/05/2018.
 */
public interface CustomerAddressDao extends BaseDao<CustomerAddress> {
    public CustomerAddressDto addCustomerAddress(CustomerAddressDto customerAddressDto);
    public List<CustomerAddressDto> getCustomerAddressByCityId(Long cityId);
    public Integer getCustomerAddressCountByCityId(Long cityId);
}
