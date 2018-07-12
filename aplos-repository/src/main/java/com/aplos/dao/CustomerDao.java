package com.aplos.dao;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.common.dto.CustomerBasicInfoDto;
import com.aplos.common.dto.CustomerDto;

import java.util.List;

/**
 * Created by Aux072 on 28/05/2018.
 */
public interface CustomerDao {
    public List<CustomerDto> getCustomerByCityIdByClientId(Long cityId, Long clientId);
    public List<CustomerDto> getAllPaginatedCustomersForCityIdClientId(Long cityId, Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public CustomerBasicInfoDto getCustomerSalesInforByCustomerId(Long customerId);
    public CustomerDto getCustomerByCustomerId(Long customerId);
    public List<CustomerDto> getAllCustomersByClientId(Long clientId);
}
