package com.aplos.service.bl;

import com.aplos.common.dto.CustomerRatingDto;
import com.aplos.dao.CustomerRatingDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 17/05/2018.
 */
@Service
public class CustomerRatingServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRatingServiceBL.class);

    @Autowired
    CustomerRatingDao customerRatingDao;

    public CustomerRatingDto addCustomerRating(CustomerRatingDto customerRatingDto){
        LOGGER.info("CustomerRatingServiceBL.addCustomerRating(customerAddressDto) execution started.");
        return customerRatingDao.addCustomerRating(customerRatingDto);
    }
}
