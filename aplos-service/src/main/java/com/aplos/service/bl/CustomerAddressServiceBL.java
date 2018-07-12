package com.aplos.service.bl;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.dao.CustomerAddressDao;
import com.aplos.domain.CustomerAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 14/05/2018.
 */
@Service
public class CustomerAddressServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerAddressServiceBL.class);

    @Autowired
    CustomerAddressDao customerAddressDao;

    public CustomerAddressDto addCustomerAddress(CustomerAddressDto customerAddressDto){
        LOGGER.info("CustomerAddressServiceBL.addCustomerAddress(customerAddressDto) execution started.");
        return customerAddressDao.addCustomerAddress(customerAddressDto);
    }

    public List<CustomerAddressDto> getCustomerAddressByCityId(Long cityId){
        LOGGER.info("CustomerAddressServiceBL.getCustomerAddressCountByCityId(cityId) execution started.");
        return customerAddressDao.getCustomerAddressByCityId(cityId);
    }

    public Integer getCustomerAddressCountByCityId(Long cityId){
        LOGGER.info("CustomerAddressServiceBL.getCustomerAddressCountByCityId(cityId) execution started.");
        return customerAddressDao.getCustomerAddressCountByCityId(cityId);
    }
}
