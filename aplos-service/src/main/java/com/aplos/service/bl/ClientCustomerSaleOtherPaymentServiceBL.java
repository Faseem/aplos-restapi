package com.aplos.service.bl;

import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.dao.ClientCustomerSaleOtherPaymentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 04/07/2018.
 */
@Service
public class ClientCustomerSaleOtherPaymentServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleOtherPaymentServiceBL.class);

    @Autowired
    ClientCustomerSaleOtherPaymentDao clientCustomerSaleOtherPaymentDao;

    public List<ClientCustomerSaleOtherPaymentDto> getClientCustomerOtherPayment(Long clientId, Long customerId, Long saleId){
        LOGGER.info("ClientCustomerSaleOtherPaymentServiceBL.getClientCustomerOtherPayment(clientId, customerId, saleId) execution started.");
        return clientCustomerSaleOtherPaymentDao.getClientCustomerOtherPayment(clientId, customerId, saleId);
    }

    public ClientCustomerSaleOtherPaymentDto addClientCustomerSaleOtherPayment(ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDto){
        LOGGER.info("ClientCustomerSaleOtherPaymentServiceBL.addClientCustomerOtherPayment(clientCustomerSaleOtherPaymentDto) execution started.");
        return clientCustomerSaleOtherPaymentDao.addClientCustomerSaleOtherPayment(clientCustomerSaleOtherPaymentDto);


    }
}
