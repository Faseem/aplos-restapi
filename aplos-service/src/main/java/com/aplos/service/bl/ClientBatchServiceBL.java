package com.aplos.service.bl;

import com.aplos.common.dto.ClientBatchDto;
import com.aplos.dao.ClientBatchDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 02/05/2018.
 */
@Service
public class ClientBatchServiceBL {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientBatchServiceBL.class);

    @Autowired
    ClientBatchDao clientBatchDao;

    public ClientBatchDto addClientBatch(ClientBatchDto clientBatchDto){
        LOGGER.info("ClientBatchServiceBL.addClientBatch(clientBatchDto) execution started.");
        return clientBatchDao.addClientBatch(clientBatchDto);
    }

}
