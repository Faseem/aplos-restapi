package com.aplos.controller;

import com.aplos.common.dto.ClientCustomerSaleBankPaymentDto;
import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientCustomerSaleBankPaymentService;
import com.aplos.service.ClientCustomerSaleOtherPaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 04/07/2018.
 */
@RestController
@RequestMapping("/clientCustomerSaleBankPayment")
public class ClientCustomerSaleBankPaymentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleBankPaymentController.class);

    @Autowired
    ClientCustomerSaleBankPaymentService clientCustomerSaleBankPaymentService;

    @RequestMapping(value = "/getClientCustomerSaleBankPayment", method = RequestMethod.GET)
    public ResponseDto getClientCustomerSaleBankPayment(@RequestParam("client_id") Long clientId,
                                                     @RequestParam("customer_id") Long customerId,
                                                     @RequestParam("sale_id") Long saleId
    ) {
        LOGGER.info(
                "ClientCustomerSaleBankPaymentController.getClientCustomerSaleBankPayment(Long {}, Long {}, Long {} ) invoked.",clientId, customerId, saleId);
        return clientCustomerSaleBankPaymentService.getClientCustomerBankPayment(clientId, customerId, saleId);
    }

    @RequestMapping(value = "/addClientCustomerSaleBankPayment", method = RequestMethod.POST)
    public ResponseDto addClientCustomerSaleBankPayment(@RequestBody ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto) {
        LOGGER.info(
                "ClientCustomerSaleBankPaymentController.addClientCustomerSale() invoked.");
        return clientCustomerSaleBankPaymentService.addClientCustomerSaleBankPayment(clientCustomerSaleBankPaymentDto);
    }
}
