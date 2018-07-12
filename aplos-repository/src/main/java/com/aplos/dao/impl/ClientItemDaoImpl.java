package com.aplos.dao.impl;

import com.aplos.common.dto.ClientItemDto;
import com.aplos.dao.ClientItemDao;
import com.aplos.domain.ClientItem;
import com.aplos.transformer.ClientItemTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 29/04/2018.
 */
@Repository
public class ClientItemDaoImpl extends BaseDaoImpl<ClientItem> implements ClientItemDao{

    @Autowired
    ClientItemTransformer clientItemTransformer;

    @Override
    @Transactional
    public ClientItemDto addClientItem(ClientItemDto clientItemDto) {
        ClientItem clientItem = clientItemTransformer.reverseTransform(clientItemDto);
        ClientItem clientItemResult = saveOrUpdate(clientItem);
        ClientItemDto customerDetailDtoResult = clientItemTransformer.transform(clientItemResult);
        return customerDetailDtoResult;
    }

    @Override
    public List<ClientItemDto> fetchAllItemByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientItem.class);
        criteria.add(Restrictions.eq("clientId", clientId));
        List<ClientItemDto> clientItemsDtos = new ArrayList<>();
        for (ClientItem clientItem : (ArrayList<ClientItem>)criteria.list()) {
            clientItemsDtos.add(clientItemTransformer.transform(clientItem));
        }
        return  clientItemsDtos;
    }
}
