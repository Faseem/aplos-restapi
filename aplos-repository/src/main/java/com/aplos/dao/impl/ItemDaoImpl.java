package com.aplos.dao.impl;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.common.dto.ItemDto;
import com.aplos.dao.ItemDao;
import com.aplos.domain.ClientItem;
import com.aplos.domain.Item;
import com.aplos.transformer.ClientItemTransformer;
import com.aplos.transformer.ItemTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 27/04/2018.
 */
@Repository
public class ItemDaoImpl extends BaseDaoImpl<Item> implements ItemDao {

    @Autowired
    ItemTransformer itemTransformer;

    @Autowired
    ClientItemTransformer clientItemTransformer;

    @Override
    @Transactional
    public List<ItemDto> fetchAllItemByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientItem.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        List<ItemDto> itemDtos = new ArrayList<>();
        for (ClientItem clientItem : (ArrayList<ClientItem>)criteria.list()) {
            itemDtos.add(itemTransformer.transform(clientItem.getItemId()));
        }
        return  itemDtos;
    }

    @Override
    @Transactional
    public ItemDto getItemByName(String itemName) {
        Criteria criteria = getCurrentSession().createCriteria(Item.class);
        criteria.add(Restrictions.eq("itemName", itemName));
        //criteria.setMaxResults(1);
        return itemTransformer.transform((Item) criteria.uniqueResult());
    }

    @Override
    @Transactional
    public ItemDto  getItemByNameByClient(String itemName, Long clientId){
        Criteria criteria = getCurrentSession().createCriteria(ClientItem.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.createAlias("itemId", "itemId");
        criteria.add(Restrictions.eq("itemId.itemName", itemName));
        criteria.setMaxResults(1);
        return itemTransformer.transform(((ClientItem) criteria.uniqueResult()).getItemId());
    }

    /*@Override
    @Transactional
    public ClientItemDto addClientItem(ClientItemDto clientItemDto){
        ClientItem clientItem = clientItemTransformer.reverseTransform(clientItemDto);
        saveOrUpdate(clientItem)
        CustomerDetailDto customerDetailDtoResult = getCustomerDetailsById(customerDetail.getCustomerDetailId());
        return customerDetailDtoResult;
    }*/
}
