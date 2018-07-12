package com.aplos.controller;

import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.SaleDto;
import com.aplos.service.SaleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 06/06/2018.
 */
@RestController
@RequestMapping("/sale")
public class SaleController {
    private final static Logger LOGGER = LoggerFactory.getLogger(RatingController.class);

    @Autowired
    SaleService saleService;


    @RequestMapping(value = "/addSale", method = RequestMethod.POST)
    public ResponseDto addSale(@RequestBody SaleDto saleDto) {
        LOGGER.info(
                "SaleController.addRating() invoked.");
        return saleService.addSale(saleDto);
    }

    @RequestMapping(value = "/getSalesByCustomerId", method = RequestMethod.GET)
    public ResponseDto addSale(@RequestParam("customer_id") Long customerId) {
        LOGGER.info(
                "SaleController.getSalesByCustomerId(customerId) invoked.");
        return saleService.getSalesByCustomerId(customerId);
    }
}
