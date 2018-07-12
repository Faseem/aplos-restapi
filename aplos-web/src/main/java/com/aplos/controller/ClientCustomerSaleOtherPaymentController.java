package com.aplos.controller;

import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientCustomerSaleCachePaymentService;
import com.aplos.service.ClientCustomerSaleOtherPaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 04/07/2018.
 */
@RestController
@RequestMapping("/clientCustomerSaleOtherPayment")
public class ClientCustomerSaleOtherPaymentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleOtherPaymentController.class);

    @Autowired
    ClientCustomerSaleOtherPaymentService clientCustomerSaleOtherPaymentService;

    @RequestMapping(value = "/getClientCustomerSaleOtherPayment", method = RequestMethod.GET)
    public ResponseDto getClientCustomerSaleOtherPayment(@RequestParam("client_id") Long clientId,
                                                     @RequestParam("customer_id") Long customerId,
                                                     @RequestParam("sale_id") Long saleId
    ) {
        LOGGER.info(
                "ClientCustomerSaleOtherPaymentController.getClientCustomerSaleOtherPayment(Long {}, Long {}, Long {} ) invoked.",clientId, customerId, saleId);
        return clientCustomerSaleOtherPaymentService.getClientCustomerOtherPayment(clientId, customerId, saleId);
    }

    @RequestMapping(value = "/addClientCustomerSaleOtherPayment", method = RequestMethod.POST)
    public ResponseDto addClientCustomerSaleOtherPayment(@RequestBody ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDto) {
        LOGGER.info(
                "ClientCustomerSaleOtherPaymentController.addClientCustomerSale() invoked.");
        return clientCustomerSaleOtherPaymentService.addClientCustomerSaleOtherPayment(clientCustomerSaleOtherPaymentDto);
    }
}
