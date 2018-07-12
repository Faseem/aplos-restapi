package com.aplos.controller;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ClientItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 29/04/2018.
 */
@RestController
@RequestMapping("/clientItem")
public class ClientItemController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientItemController.class);

    @Autowired
    ClientItemService clientItemService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseDto addClientItem(@RequestBody ClientItemDto clientItemDto) {
        LOGGER.info(
                "ItemController.addClientItem() invoked.");
        return clientItemService.addClientItem(clientItemDto);
    }

    @RequestMapping(value = "/getAllItemByClientId", method = RequestMethod.GET)
    public ResponseDto fetchAllItemByClientId(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "ItemController.fetchAllItemByClientId(Long {} ) invoked.",clientId);
        return clientItemService.fetchAllItemByClientId(clientId);
    }

}
