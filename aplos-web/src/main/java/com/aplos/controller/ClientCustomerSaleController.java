package com.aplos.controller;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientCustomerSaleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Aux072 on 05/06/2018.
 */
@RestController
@RequestMapping("/clientCustomerSale")
public class ClientCustomerSaleController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleController.class);

    @Autowired
    ClientCustomerSaleService clientCustomerSaleService;

    @RequestMapping(value = "/addClientCustomerSale", method = RequestMethod.POST)
    public ResponseDto addClientCustomer(@RequestBody ClientCustomerSaleDto clientCustomerSaleDto) {
        LOGGER.info(
                "ClientCustomerController.addClientCustomerSale() invoked.");
        return clientCustomerSaleService.addClientCustomerSale(clientCustomerSaleDto);
    }

    @RequestMapping(value = "/getAllSalesForCustomerIdClientId", method = RequestMethod.GET)
    public ResponseDto getAllSalesForCustomerIdClientId(@RequestParam("client_id") Long clientId,
                                                        @RequestParam("customer_id") Long customerId,
                                                        @RequestParam("is_omit_settled") Boolean isOmitSettled,
                                                        @RequestParam("start_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
                                                        @RequestParam("end_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate,
                                                        @RequestParam("startFrom") Integer startFrom,
                                                        @RequestParam("numberOfRecordNeed") Integer numberOfRecordNeed,
                                                        @RequestParam("order") String order) {
        LOGGER.info(
                "BatchItemController.getAllSalesForCustomerIdClientId(Long {}, Long {}, Boolean {}, Date {}, Date {} Integer {}, Integer{}, String {} ) invoked.",clientId, customerId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
        return clientCustomerSaleService.getAllSalesForCustomerIdClientId(clientId, customerId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
    }

    @RequestMapping(value = "/getCountForClientCustomerSale", method = RequestMethod.GET)
    public ResponseDto getCountForClientCustomerSale(@RequestParam("client_id") Long clientId,
                                                        @RequestParam("customer_id") Long customerId,
                                                        @RequestParam("is_omit_settled") Boolean isOmitSettled,
                                                        @RequestParam("start_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
                                                        @RequestParam("end_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        LOGGER.info(
                "BatchItemController.getCountForClientCustomerSale(Long {}, Long {}, Boolean {}, Date {}, Date {} ) invoked.",clientId, customerId, isOmitSettled, startDate, endDate);
        return clientCustomerSaleService.getCountForClientCustomerSale(clientId, customerId, isOmitSettled, startDate, endDate);
    }

    @RequestMapping(value = "/getAllSalesForUserIdClientId", method = RequestMethod.GET)
    public ResponseDto getAllSalesForUserIdClientId(@RequestParam("client_id") Long clientId,
                                                        @RequestParam("user_id") Long userId,
                                                        @RequestParam("is_omit_settled") Boolean isOmitSettled,
                                                        @RequestParam("start_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
                                                        @RequestParam("end_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate,
                                                        @RequestParam("startFrom") Integer startFrom,
                                                        @RequestParam("numberOfRecordNeed") Integer numberOfRecordNeed,
                                                        @RequestParam("order") String order) {
        LOGGER.info(
                "BatchItemController.getAllSalesForUserIdClientId(Long {}, Long {}, Boolean {}, Date {}, Date {} Integer {}, Integer{}, String {} ) invoked.",clientId, userId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
        return clientCustomerSaleService.getAllSalesForUserIdClientId(clientId, userId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
    }

    @RequestMapping(value = "/getCountForClientUserSale", method = RequestMethod.GET)
    public ResponseDto getCountForClientUserSale(@RequestParam("client_id") Long clientId,
                                                     @RequestParam("user_id") Long userId,
                                                     @RequestParam("is_omit_settled") Boolean isOmitSettled,
                                                     @RequestParam("start_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
                                                     @RequestParam("end_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        LOGGER.info(
                "BatchItemController.getCountForClientUserSale(Long {}, Long {}, Boolean {}, Date {}, Date {} ) invoked.",clientId, userId, isOmitSettled, startDate, endDate);
        return clientCustomerSaleService.getCountForClientUserSale(clientId, userId, isOmitSettled, startDate, endDate);
    }

    @RequestMapping(value = "/getClientCustomerSale", method = RequestMethod.GET)
    public ResponseDto getClientCustomerSale(@RequestParam("client_id") Long clientId,
                                             @RequestParam("customer_id") Long customerId,
                                             @RequestParam("sale_id") Long saleId
                                             ){

        LOGGER.info(
                "BatchItemController.getClientCustomerSale(Long {}, Long {}, Long {} ) invoked.",clientId, customerId, saleId);
        return clientCustomerSaleService.getClientCustomerSale(clientId, customerId, saleId);

    }
}
