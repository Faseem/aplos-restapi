package com.aplos.service.impl;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.ClientItemService;
import com.aplos.service.bl.ClientItemServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 29/04/2018.
 */
@Service
public class ClientItemServiceImpl implements ClientItemService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    ClientItemServiceBL clientItemServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addClientItem(ClientItemDto clientItemDto) {
        LOGGER.info("ClientItemServiceImpl.addClientItem(clientItem) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientItemDto clientItemDtoResult = clientItemServiceBL.addClientItem(clientItemDto);
            if (clientItemDtoResult != null) {
                LOGGER.info("Client Item saved for clientitemId [{}]", clientItemDtoResult.getClientItemId());
                responseDto = serviceUtil.getServiceResponse(clientItemDtoResult);
            } else {
                LOGGER.info("Unable to Save ClientItem");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CLIENT_ITEM);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving client item");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CLIENT_ITEM);
        }
        return responseDto;
    }

    public ResponseDto fetchAllItemByClientId(Long clientId) {
        LOGGER.info("ClientItemServiceImpl.fetchAllItemByClientId(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<ClientItemDto> clientItemDtos = clientItemServiceBL.fetchAllItemByClientId(clientId);
            if (clientItemDtos != null) {
                LOGGER.info("Items received for given clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(clientItemDtos);
            } else {
                LOGGER.info("Unable to receive items for the given clientId [{}]", clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_ITEM_FOR__CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive items for the given clientId [{}]", clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_ITEM_FOR__CLIENT_ID);
        }
        return responseDto;
    }
}
