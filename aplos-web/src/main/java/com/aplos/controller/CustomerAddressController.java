package com.aplos.controller;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.CustomerAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 13/05/2018.
 */
@RestController
@RequestMapping("/customerAddress")
public class CustomerAddressController {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerAddressController.class);

    @Autowired
    CustomerAddressService customerAddressService;

    @RequestMapping(value = "/addCustomerAddress", method = RequestMethod.POST)
    public ResponseDto addCustomerAddress(@RequestBody CustomerAddressDto customerAddressDto) {
        LOGGER.info(
                "CustomerAddressController.addCustomerAddress() invoked.");
        return customerAddressService.addCustomerAddress(customerAddressDto);
    }
}
