package com.aplos.controller;

import com.aplos.common.dto.ClientCustomerDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 08/05/2018.
 */
@RestController
@RequestMapping("/clientCustomer")
public class ClientCustomerController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientCustomerController.class);

    @Autowired
    ClientCustomerService clientCustomerService;

    @RequestMapping(value = "/addClientCustomer", method = RequestMethod.POST)
    public ResponseDto addClientCustomer(@RequestBody ClientCustomerDto clientCustomerDto) {
        LOGGER.info(
                "ClientCustomerController.addClientCustomer() invoked.");
        return clientCustomerService.addClientCustomer(clientCustomerDto);
    }
}
