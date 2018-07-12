package com.aplos.service.bl;

import com.aplos.common.dto.ClientCustomerSaleBankPaymentDto;
import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.dao.ClientCustomerSaleBankPaymentDao;
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
public class ClientCustomerSaleBankPaymentServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleBankPaymentServiceBL.class);

    @Autowired
    ClientCustomerSaleBankPaymentDao clientCustomerSaleBankPaymentDao;

    public List<ClientCustomerSaleBankPaymentDto> getClientCustomerBankPayment(Long clientId, Long customerId, Long saleId){
        LOGGER.info("ClientCustomerSaleBankPaymentServiceBL.getClientCustomerBankPayment(clientId, customerId, saleId) execution started.");
        return clientCustomerSaleBankPaymentDao.getClientCustomerBankPayment(clientId, customerId, saleId);
    }

    public ClientCustomerSaleBankPaymentDto addClientCustomerSaleBankPayment(ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto){
        LOGGER.info("ClientCustomerSaleBankPaymentServiceBL.addClientCustomerBankPayment(clientCustomerSaleBankPaymentDto) execution started.");
        return clientCustomerSaleBankPaymentDao.addClientCustomerSaleBankPayment(clientCustomerSaleBankPaymentDto);


    }
}
