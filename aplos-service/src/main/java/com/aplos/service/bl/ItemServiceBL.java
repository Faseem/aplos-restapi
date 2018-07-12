package com.aplos.service.bl;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.dao.ItemDao;
import com.aplos.domain.ClientItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 29/04/2018.
 */
@Service
public class ItemServiceBL {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceBL.class);

    /*@Autowired
    ItemDao itemDao;*/

    /*public ClientItemDto addClientItem(ClientItemDto clientItemDto){
        LOGGER.info(
                "ItemServiceBL.addClientItem(ClientItemDto clientItemDto) invoked.");
        return itemDao.addClientItem(clientItemDto);
    }*/
}
