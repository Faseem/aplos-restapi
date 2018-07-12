package com.aplos.service.bl;

import com.aplos.common.dto.CustomerBasicInfoDto;
import com.aplos.common.dto.CustomerDto;
import com.aplos.dao.CustomerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 28/05/2018.
 */
@Service
public class CustomerServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceBL.class);

    @Autowired
    CustomerDao customerDao;

    public List<CustomerDto> getCustomerByCityIdByClientId(Long cityId, Long clientId){
        LOGGER.info("CustomerServiceBL.getCustomerByCityIdByClientId(cityId, clientId) execution started.");
        return customerDao.getCustomerByCityIdByClientId(cityId, clientId);
    }

    public Integer getCustomerCountByCityIdByCityIdByClientId(Long cityId,  Long clientId){
        LOGGER.info("CustomerServiceBL.getCustomerCountByCityIdByCityIdByClientId(cityId, clientId) execution started.");
        List<CustomerDto> customerDtos = customerDao.getCustomerByCityIdByClientId(cityId, clientId);
        if(customerDtos == null || customerDtos.size()<0){
            return 0;
        }
        return customerDtos.size();
    }

    public List<CustomerDto> getAllPaginatedCustomersForCityIdClientId(Long cityId, Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("CustomerServiceBL.getAllPaginatedCustomersForCityIdClientId(cityId, clientId, startFrom, numberOfRecordNeed, order) execution started.");
        return customerDao.getAllPaginatedCustomersForCityIdClientId(cityId, clientId, startFrom, numberOfRecordNeed, order);
    }

    public CustomerBasicInfoDto getCustomerSalesInforByCustomerId(Long customerId){
        LOGGER.info("CustomerServiceBL.getCustomerSalesInforByCustomerId(customerId) execution started.");
        return customerDao.getCustomerSalesInforByCustomerId(customerId);
    }

    public List<CustomerDto> getAllCustomersByClientId(Long clientId){
        LOGGER.info("CustomerServiceBL.getAllCustomersByClientId(clientId) execution started.");
        return customerDao.getAllCustomersByClientId(clientId);
    }
}
