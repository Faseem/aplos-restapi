package com.aplos.controller;

import com.aplos.common.dto.ResponseDto;
import com.aplos.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aux072 on 28/05/2018.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/getCustomerCountByCityIdClientId", method = RequestMethod.GET)
    public ResponseDto getCustomerCountByCityIdClientId(@RequestParam("city_id") Long cityId, @RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "CustomerController.getCustomerCountByCityId() invoked.");
        return customerService.getCustomerCountByCityIdByCityId(cityId, clientId);
    }

    @RequestMapping(value = "/getCustomerByCityIdByClientId", method = RequestMethod.GET)
    public ResponseDto getCustomerByCityIdByClientId(@RequestParam("city_id") Long cityId, @RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "CustomerController.getCustomerByCityIdByClientId() invoked.");
        return customerService.getCustomerByCityIdByClientId(cityId, clientId);
    }

    @RequestMapping(value = "/getAllPaginatedCustomersForCityIdClientId", method = RequestMethod.GET)
    public ResponseDto getAllPaginatedCustomersForCityIdClientId(@RequestParam("city_id") Long cityId,
                                                                 @RequestParam("client_id") Long clientId,
                                                                 @RequestParam("start_at") Integer startFrom,
                                                                 @RequestParam("numberOfRecordNeed") Integer numberOfRecordNeed,
                                                                 @RequestParam("order") String order) {
        LOGGER.info(
                "CustomerController.getCustomerByCityIdByClientId() invoked.");
        return customerService.getAllPaginatedCustomersForCityIdClientId(cityId, clientId, startFrom, numberOfRecordNeed, order);
    }

    @RequestMapping(value = "/getCustomerSalesInforByCustomerId", method = RequestMethod.GET)
    public ResponseDto getCustomerSalesInforByCustomerId(@RequestParam("customer_id") Long customerId) {
        LOGGER.info(
                "CustomerController.getCustomerSalesInforByCustomerId() invoked.");
        return customerService.getCustomerSalesInforByCustomerId(customerId);
    }

    @RequestMapping(value = "/getAllCustomersByClientId", method = RequestMethod.GET)
    public ResponseDto getAllCustomersByClientId(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "CustomerController.getAllCustomersByClientId() invoked.");
        return customerService.getAllCustomersByClientId(clientId);
    }
}
