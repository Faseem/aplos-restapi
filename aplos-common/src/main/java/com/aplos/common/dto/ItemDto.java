package com.aplos.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ItemDto implements Serializable {

    private static final long serialVersionUID = 5820008157862853492L;

    private Long itemId;
    private String itemName;
    private String itemDescription;
    private List<ClientItemDto> clientItemList;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public List<ClientItemDto> getClientItemList() {
        return clientItemList;
    }

    public void setClientItemList(List<ClientItemDto> clientItemList) {
        this.clientItemList = clientItemList;
    }
}
