package com.aplos.controller;

import com.aplos.common.dto.ClientBatchDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientBatchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aux072 on 02/05/2018.
 */
@RestController
@RequestMapping("/clientBatch")
public class ClientBatchController {
    private final static Logger LOGGER = LoggerFactory.getLogger(BatchController.class);

    @Autowired
    ClientBatchService clientBatchService;

    @RequestMapping(value = "/addClientBatch", method = RequestMethod.POST)
    public ResponseDto addClientItem(@RequestBody ClientBatchDto clientBatchDto) {
        LOGGER.info(
                "ClientBatchController.addClientBatch() invoked.");
        return clientBatchService.addClientBatch(clientBatchDto);
    }
}
