package com.aplos.controller;

import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.CustomerSalesExtraInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 02/06/2018.
 */
@RestController
@RequestMapping("/customerSalesExtraInfo")
public class CustomerSalesExtraInfoController {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerAddressController.class);

    @Autowired
    CustomerSalesExtraInfoService customerSalesExtraInfoService;

    @RequestMapping(value = "/getCustomerSalesExtraInfoByCustomerId", method = RequestMethod.GET)
    public ResponseDto getCustomerSalesExtraInfoByCustomerId(@RequestParam("customer_id") Long customerId) {
        LOGGER.info(
                "CustomerSalesExtraInfoController.getCustomerSalesInforByCustomerId() invoked.");
        return customerSalesExtraInfoService.getCustomerSalesInforByCustomerId(customerId);
    }

    @RequestMapping(value = "/addCustomerSalesExtraInfo", method = RequestMethod.POST)
    public ResponseDto addCustomerSalesExtraInfo(@RequestBody CustomerSalesExtraInfoDto customerSalesExtraInfoDto) {
        LOGGER.info(
                "CustomerSalesExtraInfoController.addCustomerSalesExtraInfo() invoked.");
        return customerSalesExtraInfoService.addCustomerSalesExtraInfo(customerSalesExtraInfoDto);
    }
}
