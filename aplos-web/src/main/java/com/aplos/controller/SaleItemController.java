package com.aplos.controller;

import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.SaleItemDto;
import com.aplos.service.SaleItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aux072 on 06/06/2018.
 */
@RestController
@RequestMapping("/saleItem")
public class SaleItemController {
    private final static Logger LOGGER = LoggerFactory.getLogger(RatingController.class);

    @Autowired
    SaleItemService saleItemService;


    @RequestMapping(value = "/addSaleItem", method = RequestMethod.POST)
    public ResponseDto addSale(@RequestBody SaleItemDto saleItemDto) {
        LOGGER.info(
                "SaleItemController.addSaleItem() invoked.");
        return saleItemService.addSaleItem(saleItemDto);
    }
}
