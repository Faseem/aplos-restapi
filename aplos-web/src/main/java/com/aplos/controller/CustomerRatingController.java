package com.aplos.controller;

import com.aplos.common.dto.CustomerRatingDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.CustomerRatingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 17/05/2018.
 */
@RestController
@RequestMapping("/customerRating")
public class CustomerRatingController {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerAddressController.class);

    @Autowired
    CustomerRatingService customerRatingService;

    @RequestMapping(value = "/addCustomerRating", method = RequestMethod.POST)
    public ResponseDto addCustomerRating(@RequestBody CustomerRatingDto customerRatingDto) {
        LOGGER.info(
                "CustomerRatingController.addCustomerRating() invoked.");
        return customerRatingService.addCustomerRating(customerRatingDto);
    }
}
