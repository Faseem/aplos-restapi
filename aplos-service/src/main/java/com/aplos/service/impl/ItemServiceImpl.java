package com.aplos.service.impl;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ItemDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.dao.ItemDao;
import com.aplos.dao.impl.BaseDaoImpl;
import com.aplos.domain.User;
import com.aplos.service.ItemService;
import com.aplos.service.bl.ItemServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 27/04/2018.
 */
@Service
public class ItemServiceImpl  extends BaseDaoImpl<User> implements ItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    ItemDao itemDao;

    @Autowired
    ServiceUtil serviceUtil;

    @Autowired
    ItemServiceBL itemServiceBL;

    public ResponseDto getItemByName(String itemName) {
        LOGGER.info("ItemServiceImpl.getItemByName(itemName) execution started.");
        ResponseDto responseDto = null;
        try {
            ItemDto item = itemDao.getItemByName(itemName);
            if (item != null) {
                LOGGER.info("Items received for given ItemName [{}]", itemName);
                responseDto = serviceUtil.getServiceResponse(item);
            } else {
                LOGGER.info("Unable to receive items for the given itemName [{}]", itemName);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_ITEM_FOR_ITEM_NAME);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive items for the given itemName [{}]", itemName);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_ITEM_FOR_ITEM_NAME);
        }
        return responseDto;
    }

    public ResponseDto fetchAllItemByClientId(Long clientId) {
        LOGGER.info("ItemServiceImpl.fetchAllItemByClientId(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ItemDto> items = itemDao.fetchAllItemByClientId(clientId);
            if (items != null) {
                LOGGER.info("Items received for given clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(items);
            } else {
                LOGGER.info("Unable to receive items for the given clientId [{}]", clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_USERS_NOT_FOUND);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive items for the given clientId [{}]", clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_USER_RETRIEVE);
        }
        return responseDto;
    }

    public ResponseDto getItemByNameByClient(String itemName, Long clientId) {
        LOGGER.info("ItemServiceImpl.getItemByNameByClient(itemName , clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            ItemDto item = itemDao.getItemByNameByClient(itemName, clientId);
            if (item != null) {
                LOGGER.info("Items received for given ItemName [{}] clientId [{}]", itemName, clientId);
                responseDto = serviceUtil.getServiceResponse(item);
            } else {
                LOGGER.info("Unable to receive items for the given ItemName [{}] clientId [{}]", itemName, clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_ITEM_FOR_ITEM_NAME_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive items for the given itemName clientId [{}]", itemName, clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_ITEM_FOR_ITEM_NAME_CLIENT_ID);
        }
        return responseDto;
    }
}
