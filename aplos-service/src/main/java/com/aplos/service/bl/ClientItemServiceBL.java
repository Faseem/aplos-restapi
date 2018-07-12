package com.aplos.service.bl;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.dao.ClientItemDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 29/04/2018.
 */
@Service
public class ClientItemServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceBL.class);

    @Autowired
    ClientItemDao clientItemDao;

    public ClientItemDto addClientItem(ClientItemDto clientItemDto){
        LOGGER.info("ClientItemServiceBL.addClientItem(clientItemDto) execution started.");
        return clientItemDao.addClientItem(clientItemDto);
    }

    public List<ClientItemDto> fetchAllItemByClientId(Long clientId){
        LOGGER.info("ClientItemServiceBL.fetchAllItemByClientId(clientId) execution started.");
        return clientItemDao.fetchAllItemByClientId(clientId);
    }
}
