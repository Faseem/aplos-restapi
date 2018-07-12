package com.aplos.controller;

import com.aplos.common.dto.BatchDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.BatchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 30/04/2018.
 */
@RestController
@RequestMapping("/batch")
public class BatchController {
    private final static Logger LOGGER = LoggerFactory.getLogger(BatchController.class);

    @Autowired
    BatchService batchService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseDto addClientItem(@RequestBody BatchDto batchDto) {
        LOGGER.info(
                "BatchController.addClientItem() invoked.");
        return batchService.addBatch(batchDto);
    }

    @RequestMapping(value = "/getAllBatchesForClient", method = RequestMethod.GET)
    public ResponseDto getAllBatchesForClient(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "BatchController.getAllBatchesForClient(clientId) invoked.");
        return batchService.getAllBatchesForClient(clientId);
    }
}
