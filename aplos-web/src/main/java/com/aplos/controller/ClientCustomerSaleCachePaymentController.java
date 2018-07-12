package com.aplos.controller;

import com.aplos.common.dto.ClientCustomerSaleCachePaymentDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientCustomerSaleCachePaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 29/06/2018.
 */
@RestController
@RequestMapping("/clientCustomerSaleCachePayment")
public class ClientCustomerSaleCachePaymentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleCachePaymentController.class);

    @Autowired
    ClientCustomerSaleCachePaymentService clientCustomerSaleCachePaymentService;

    @RequestMapping(value = "/getClientCustomerSaleCachePayment", method = RequestMethod.GET)
    public ResponseDto getClientCustomerCachePayment(@RequestParam("client_id") Long clientId,
                                                 @RequestParam("customer_id") Long customerId,
                                                 @RequestParam("sale_id") Long saleId
                                                 ) {
        LOGGER.info(
                "ClientCustomerSaleCachePaymentController.getClientCustomerCachePayment(Long {}, Long {}, Long {} ) invoked.",clientId, customerId, saleId);
        return clientCustomerSaleCachePaymentService.getClientCustomerCachePayment(clientId, customerId, saleId);
    }

    @RequestMapping(value = "/addClientCustomerSaleCachePayment", method = RequestMethod.POST)
    public ResponseDto addClientCustomerSaleCachePayment(@RequestBody ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDto) {
        LOGGER.info(
                "ClientCustomerController.addClientCustomerSale() invoked.");
        return clientCustomerSaleCachePaymentService.addClientCustomerSaleCachePayment(clientCustomerSaleCachePaymentDto);
    }
}
