package com.aplos.service;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 27/04/2018.
 */
public interface ItemService {
    public ResponseDto fetchAllItemByClientId(Long clientId);
    public ResponseDto getItemByName(String itemName);
    public ResponseDto getItemByNameByClient(String itemName, Long clientId);
}
