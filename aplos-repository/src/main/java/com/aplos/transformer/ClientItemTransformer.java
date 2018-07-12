package com.aplos.transformer;

import com.aplos.common.dto.ClientAddressDto;
import com.aplos.common.dto.ClientItemDto;
import com.aplos.domain.ClientItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 29/04/2018.
 */
@Service
public class ClientItemTransformer implements BaseTransformer<ClientItem, ClientItemDto> {

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    ItemTransformer itemTransformer;

    @Override
    public ClientItemDto transform(ClientItem clientItem) {
        ClientItemDto clientItemDto =new ClientItemDto();
        clientItemDto.setClientId(clientTrasformenr.transform(clientItem.getClientId()));
        clientItemDto.setItemId(itemTransformer.transform(clientItem.getItemId()));
        clientItemDto.setClientItemId(clientItem.getClientItemId());
        return clientItemDto;
    }

    @Override
    public ClientItem reverseTransform(ClientItemDto clientItemDto ) {
        ClientItem clientItem =new ClientItem();
        clientItem.setClientId(clientTrasformenr.reverseTransform(clientItemDto.getClientId()));
        clientItem.setItemId(itemTransformer.reverseTransform(clientItemDto.getItemId()));
        clientItem.setClientItemId(clientItem.getClientItemId());
        return clientItem;
    }
}
