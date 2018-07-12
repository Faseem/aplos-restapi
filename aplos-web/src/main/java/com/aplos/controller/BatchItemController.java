package com.aplos.controller;

import com.aplos.common.dto.BatchItemDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.BatchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@RestController
@RequestMapping("/batchItems")
public class BatchItemController {

    private final static Logger LOGGER = LoggerFactory.getLogger(BatchItemController.class);

    @Autowired
    BatchItemService batchItemService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseDto addClientItem(@RequestBody List<BatchItemDto> batchItemDtos) {
        LOGGER.info(
                "BatchItemController.addClientItem(batchItemDtos) invoked.");
        return batchItemService.addBatchItems(batchItemDtos);
    }

    @RequestMapping(value = "/getItemsCountForBatch", method = RequestMethod.GET)
    public ResponseDto getItemsCountForBatch(@RequestParam("batch_id") Long batch_id) {
        LOGGER.info(
                "BatchItemController.getItemsCountForBatch(batchItemDtos) invoked.");
        return batchItemService.getItemsCountForBatch(batch_id);
    }

    @RequestMapping(value = "/getAllItemsForBatchId", method = RequestMethod.GET)
    public ResponseDto getAllUsers(@RequestParam("batch_id") Long batchId,
                                   @RequestParam("startFrom") Integer startFrom,
                                   @RequestParam("numberOfRecordNeed") Integer numberOfRecordNeed,
                                   @RequestParam("order") String order) {
        LOGGER.info(
                "BatchItemController.getAllItemsForBatchId(Long {}, Integer {}, Integer{}, String {} ) invoked.",batchId, startFrom, numberOfRecordNeed, order);
        return batchItemService.getAllItemsForBatchId(batchId, startFrom, numberOfRecordNeed, order);
    }


    @RequestMapping(value = "/getAllClientBatchItemsForItemId", method = RequestMethod.GET)
    public ResponseDto getAllClientBatchItemsForItemId(@RequestParam("client_id") Long clientId,
                                   @RequestParam("item_id") Long itemId,
                                   @RequestParam("startFrom") Integer startFrom,
                                   @RequestParam("numberOfRecordNeed") Integer numberOfRecordNeed,
                                   @RequestParam("order") String order) {
        LOGGER.info(
                "BatchItemController.getAllClientBatchItemsForItemId(Long {}, Long {}, Integer {}, Integer{}, String {} ) invoked.",clientId, itemId, startFrom, numberOfRecordNeed, order);
        return batchItemService.getAllClientBatchItemsForItemId(clientId, itemId, startFrom, numberOfRecordNeed, order);
    }

    @RequestMapping(value = "/getAllClientBatchItemsForItemIdWithoutPagination", method = RequestMethod.GET)
    public ResponseDto getAllClientBatchItemsForItemIdWithoutPagination(@RequestParam("client_id") Long clientId,
                                                       @RequestParam("item_id") Long itemId) {
        LOGGER.info(
                "BatchItemController.getAllClientBatchItemsForItemIdWithoutPagination(Long {}, Long {} ) invoked.",clientId, itemId);
        return batchItemService.getAllClientBatchItemsForItemId(clientId, itemId, null, null, null);
    }

    @RequestMapping(value = "/getBatchItemsCountForClient", method = RequestMethod.GET)
    public ResponseDto getBatchItemsCountForClient(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "BatchItemController.getBatchItemsCountForClient(clientId) invoked.");
        return batchItemService.getBatchItemsCountForClient(clientId);
    }

    @RequestMapping(value = "/getAllBatchItemsForClientId", method = RequestMethod.GET)
    public ResponseDto getAllBatchItemsForClientId(@RequestParam("client_id") Long clientId,
                                   @RequestParam("startFrom") Integer startFrom,
                                   @RequestParam("numberOfRecordNeed") Integer numberOfRecordNeed,
                                   @RequestParam("order") String order) {
        LOGGER.info(
                "BatchItemController.getAllBatchItemsForClientId(Long {}, Integer {}, Integer{}, String {} ) invoked.",clientId, startFrom, numberOfRecordNeed, order);
        return batchItemService.getAllBatchItemsForClientId(clientId, startFrom, numberOfRecordNeed, order);
    }

    @RequestMapping(value = "/getItemsCountForClientItem", method = RequestMethod.GET)
    public ResponseDto getItemsCountForClientItem(@RequestParam("client_id") Long clientId,
                                                  @RequestParam("item_id") Long itemId) {
        LOGGER.info(
                "BatchItemController.getItemsCountForClientItem(clientId, itemId) invoked.");
        return batchItemService.getItemsCountForClientItem(clientId, itemId);
    }

    @RequestMapping(value = "/getStockItemsCountForClientBatchItem", method = RequestMethod.GET)
    public ResponseDto getStockItemsCountForClientBatchItem(@RequestParam("batch_item_id") Long batchItemId) {
        LOGGER.info(
                "BatchItemController.getStockItemsCountForClientBatchItem(batchItemId) invoked.");
        return batchItemService.getStockItemsCountForClientBatchItem(batchItemId);
    }
}
