package com.aplos.service;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 29/04/2018.
 */
public interface ClientItemService {
    public ResponseDto addClientItem(ClientItemDto clientItemDto);
    public ResponseDto fetchAllItemByClientId(Long clientId);
}
