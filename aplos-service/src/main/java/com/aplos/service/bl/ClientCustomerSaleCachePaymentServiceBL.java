package com.aplos.service.bl;

import com.aplos.common.dto.*;
import com.aplos.dao.ClientCustomerSaleCachePaymentDao;
import com.aplos.dao.CustomerDao;
import com.aplos.dao.CustomerSalesExtraInfoDao;
import com.aplos.dao.SaleDao;
import com.aplos.domain.CustomerSalesExtraInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 29/06/2018.
 */
@Service
public class ClientCustomerSaleCachePaymentServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleCachePaymentServiceBL.class);

    @Autowired
    ClientCustomerSaleCachePaymentDao clientCustomerSaleCachePaymentDao;

    public List<ClientCustomerSaleCachePaymentDto> getClientCustomerCachePayment(Long clientId, Long customerId, Long saleId){
        LOGGER.info("ClientCustomerSaleCachePaymentServiceBL.getClientCustomerCachePayment(clientId, customerId, saleId) execution started.");
        return clientCustomerSaleCachePaymentDao.getClientCustomerCachePayment(clientId, customerId, saleId);
    }

    public ClientCustomerSaleCachePaymentDto addClientCustomerSaleCachePayment(ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDto){
        LOGGER.info("ClientCustomerSaleCachePaymentServiceBL.addClientCustomerCachePayment(clientCustomerSaleCachePaymentDto) execution started.");
        return clientCustomerSaleCachePaymentDao.addClientCustomerSaleCachePayment(clientCustomerSaleCachePaymentDto);


    }

}
