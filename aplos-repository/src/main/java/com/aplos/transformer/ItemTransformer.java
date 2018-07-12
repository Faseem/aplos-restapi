package com.aplos.transformer;

import com.aplos.common.dto.ItemDto;
import com.aplos.domain.Item;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 27/04/2018.
 */
@Service
public class ItemTransformer implements BaseTransformer <Item,ItemDto> {
    @Override
    public ItemDto transform(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setItemId(item.getItemId());
        itemDto.setItemDescription(item.getItemDescription());
        itemDto.setItemName(item.getItemName());
        return itemDto;
    }

    @Override
    public Item reverseTransform(ItemDto itemDto) {
        Item item = new Item();
        item.setItemId(itemDto.getItemId());
        item.setItemDescription(itemDto.getItemDescription());
        item.setItemName(itemDto.getItemName());
        return item;
    }
}
