package com.aplos.dao;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ItemDto;
import com.aplos.domain.Item;

import java.util.List;

/**
 * Created by Aux072 on 27/04/2018.
 */
public interface ItemDao extends BaseDao<Item> {
    public List<ItemDto> fetchAllItemByClientId(Long clientId);
    public ItemDto getItemByName(String itemName);
    public ItemDto getItemByNameByClient(String itemName, Long clientId);
    /*public ClientItemDto addClientItem(ClientItemDto clientItemDto);*/
}
