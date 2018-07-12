package com.aplos.dao;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.domain.ClientItem;

import java.util.List;

/**
 * Created by Aux072 on 29/04/2018.
 */
public interface ClientItemDao extends BaseDao<ClientItem> {
    public ClientItemDto addClientItem(ClientItemDto clientItemDto);
    public List<ClientItemDto> fetchAllItemByClientId(Long clientId);
}
