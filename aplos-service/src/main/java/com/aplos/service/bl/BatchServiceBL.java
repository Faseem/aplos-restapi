package com.aplos.service.bl;

import com.aplos.common.dto.BatchDto;
import com.aplos.dao.BatchDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@Service
public class BatchServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceBL.class);

    @Autowired
    BatchDao batchDao;

    public BatchDto addBatch(BatchDto batchDto){
        LOGGER.info("BatchServiceBL.addClientItem(batchDto) execution started.");
        return batchDao.addClientItem(batchDto);
    }

    public List<BatchDto> getAllBatchesForClient(Long clientId){
        LOGGER.info("BatchServiceBL.getAllBatchesForClient(clientId) execution started.");
        return batchDao.getAllBatchesForClient(clientId);
    }
}
