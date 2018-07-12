package com.aplos.dao.impl;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.dao.ClientCustomerSaleDao;
import com.aplos.domain.ClientCustomerSale;
import com.aplos.transformer.ClientCustomerSaleTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Repository
public class ClientCustomerSaleDaoImpl extends BaseDaoImpl<ClientCustomerSale> implements ClientCustomerSaleDao {

    @Autowired
    ClientCustomerSaleTransformer clientCustomerSaleTransformer;

    @Transactional
    @Override
    public ClientCustomerSaleDto addClientCustomerSale(ClientCustomerSaleDto clientCustomerSaleDto) {
        ClientCustomerSale clientCustomerSaleResult = (ClientCustomerSale) saveOrUpdate(clientCustomerSaleTransformer.reverseTransform(clientCustomerSaleDto));
        return clientCustomerSaleTransformer.transform(clientCustomerSaleResult);
    }

    @Override
    public List<ClientCustomerSaleDto> getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSale.class);
        if (numberOfRecordNeed != null) {
            criteria.setMaxResults(numberOfRecordNeed);
        }
        if (startFrom != null) {
            criteria.setFirstResult(startFrom);
        }
        if(customerId != null){
            criteria.createAlias("customerId", "customerId");
            criteria.add(Restrictions.eq("customerId.customerId", customerId));
        }

        //fiter by date here

        if(isOmitSettled != null){
            criteria.add(Restrictions.eq("saleIsSettled", false));
        }


        List<ClientCustomerSaleDto> clientCustomerSaleDtos = new ArrayList<>();
        for(ClientCustomerSale  clientCustomerSale: (ArrayList<ClientCustomerSale>)criteria.list()){
            clientCustomerSaleDtos.add(clientCustomerSaleTransformer.transform(clientCustomerSale));
        }

        return clientCustomerSaleDtos;
    }

    @Override
    public Integer getCountForClientCustomerSale(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSale.class);

        if(customerId != null){
            criteria.createAlias("customerId", "customerId");
            criteria.add(Restrictions.eq("customerId.customerId", customerId));
        }

        //fiter by date here

        if(isOmitSettled != null){
            criteria.add(Restrictions.eq("saleIsSettled", false));
        }

        return criteria.list().size();

    }

    @Override
    public List<ClientCustomerSaleDto> getAllSalesForUserIdClientId(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSale.class);
        if (numberOfRecordNeed != null) {
            criteria.setMaxResults(numberOfRecordNeed);
        }
        if (startFrom != null) {
            criteria.setFirstResult(startFrom);
        }
        if(userId != null){
            criteria.createAlias("createdUserId", "createdUserId");
            criteria.add(Restrictions.eq("createdUserId.userId", userId));
        }

        //fiter by date here

        if(isOmitSettled != null){
            criteria.add(Restrictions.eq("saleIsSettled", false));
        }


        List<ClientCustomerSaleDto> clientCustomerSaleDtos = new ArrayList<>();
        for(ClientCustomerSale  clientCustomerSale: (ArrayList<ClientCustomerSale>)criteria.list()){
            clientCustomerSaleDtos.add(clientCustomerSaleTransformer.transform(clientCustomerSale));
        }

        return clientCustomerSaleDtos;
    }

    @Override
    public Integer getCountForClientUserSale(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSale.class);

        if(userId != null){
            criteria.createAlias("createdUserId", "createdUserId");
            criteria.add(Restrictions.eq("createdUserId.userId", userId));
        }

        //fiter by date here

        if(isOmitSettled != null){
            criteria.add(Restrictions.eq("saleIsSettled", false));
        }

        return criteria.list().size();

    }

    @Override
    public ClientCustomerSaleDto getClientCustomerSale(Long clientId, Long customerId, Long saleId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSale.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.createAlias("customerId", "customerId");
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        criteria.createAlias("saleId", "saleId");
        criteria.add(Restrictions.eq("saleId.saleId", saleId));
        return clientCustomerSaleTransformer.transform((ClientCustomerSale) criteria.uniqueResult());
    }
}
