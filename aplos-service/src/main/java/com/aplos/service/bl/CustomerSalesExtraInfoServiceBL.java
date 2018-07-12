package com.aplos.service.bl;

import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.dao.CustomerSalesExtraInfoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Aux072 on 02/06/2018.
 */
@Service
public class CustomerSalesExtraInfoServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerSalesExtraInfoServiceBL.class);

    @Autowired
    CustomerSalesExtraInfoDao customerSalesExtraInfoDao;

    public CustomerSalesExtraInfoDto getCustomerSalesInforByCustomerId(Long customerId){
        LOGGER.info("CustomerSalesExtraInfoServiceBL.getCustomerSalesInforByCustomerId(customerId) execution started.");
        return customerSalesExtraInfoDao.getCustomerSalesInforByCustomerId(customerId);
    }

    public CustomerSalesExtraInfoDto addCustomerSalesExtraInfo(CustomerSalesExtraInfoDto customerSalesExtraInfoDto){
        LOGGER.info("CustomerSalesExtraInfoServiceBL.addCustomerSalesExtraInfo(customerSalesExtraInfoDto) execution started.");
        return customerSalesExtraInfoDao.addCustomerSalesExtraInfoDto(customerSalesExtraInfoDto);
    }
}
