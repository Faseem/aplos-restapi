package com.aplos.controller;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 27/04/2018.
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/getAllItemByClientId", method = RequestMethod.GET)
    public ResponseDto fetchAllItemByClientId(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "ItemController.fetchAllItemByClientId(Long {} ) invoked.",clientId);
        return itemService.fetchAllItemByClientId(clientId);
    }

    @RequestMapping(value = "/getItemByName", method = RequestMethod.GET)
    public ResponseDto getItemByName(@RequestParam("item_name") String itemName) {
        LOGGER.info(
                "ItemController.getItemByName(String {} ) invoked.",itemName);
        return itemService.getItemByName(itemName);
    }

    @RequestMapping(value = "/getItemByNameByClient", method = RequestMethod.GET)
    public ResponseDto getItemByNameByClient(@RequestParam("item_name") String itemName, @RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "ItemController.getItemByNameByClient(String {}, Long {} ) invoked.",itemName, clientId);
        return itemService.getItemByNameByClient(itemName, clientId);
    }
}
