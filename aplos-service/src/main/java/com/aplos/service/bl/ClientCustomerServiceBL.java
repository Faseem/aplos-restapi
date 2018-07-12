package com.aplos.service.bl;

import com.aplos.common.dto.ClientCustomerDto;
import com.aplos.dao.ClientCustomerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class ClientCustomerServiceBL {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerServiceBL.class);

    @Autowired
    ClientCustomerDao clientCustomerDao;

    public ClientCustomerDto addClientCustomer(ClientCustomerDto clientCustomerDto){
        LOGGER.info("ClientCustomerServiceBL.addClientCustomer(clientCustomerDto) execution started.");
        return clientCustomerDao.addClientCustomer(clientCustomerDto);
    }
}
