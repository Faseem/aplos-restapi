package com.aplos.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientItemDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Integer clientItemId;
    private ClientDto clientId;
    private ItemDto itemId;

    public Integer getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(Integer clientItemId) {
        this.clientItemId = clientItemId;
    }

    public ClientDto getClientId() {
        return clientId;
    }

    public void setClientId(ClientDto clientId) {
        this.clientId = clientId;
    }

    public ItemDto getItemId() {
        return itemId;
    }

    public void setItemId(ItemDto itemId) {
        this.itemId = itemId;
    }
}
