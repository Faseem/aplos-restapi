package com.aplos.dao.impl;

import com.aplos.common.dto.ClientCustomerSaleCachePaymentDto;
import com.aplos.dao.ClientCustomerSaleCachePaymentDao;
import com.aplos.domain.ClientCustomerSaleCachePayment;
import com.aplos.transformer.ClientCustomerSaleCachePaymentTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 29/06/2018.
 */
@Repository
public class ClientCustomerSaleCachePaymentDaoImpl   extends BaseDaoImpl<ClientCustomerSaleCachePayment> implements ClientCustomerSaleCachePaymentDao {

    @Autowired
    ClientCustomerSaleCachePaymentTransformer clientCustomerSaleCachePaymentTransformer;

    @Override
    public List<ClientCustomerSaleCachePaymentDto> getClientCustomerCachePayment(Long clientId, Long customerId, Long saleId) {

        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSaleCachePayment.class);

        criteria.createAlias("clientId", "clientId");
        criteria.createAlias("customerId", "customerId");
        criteria.createAlias("saleId", "saleId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        criteria.add(Restrictions.eq("saleId.saleId", saleId));
        List<ClientCustomerSaleCachePayment> clientCustomerSaleCachePayments = criteria.list();
        List<ClientCustomerSaleCachePaymentDto> cachePaymentsToRet = new ArrayList<>();
        if(clientCustomerSaleCachePayments!=null && clientCustomerSaleCachePayments.size()>0){
            for(ClientCustomerSaleCachePayment clientCustomerSaleCachePayment: clientCustomerSaleCachePayments){
                cachePaymentsToRet.add(clientCustomerSaleCachePaymentTransformer.transform(clientCustomerSaleCachePayment));
            }
        }
        return cachePaymentsToRet;
    }

    @Override
    @Transactional
    public ClientCustomerSaleCachePaymentDto addClientCustomerSaleCachePayment(ClientCustomerSaleCachePaymentDto clientCustomerSaleCachePaymentDto) {
        ClientCustomerSaleCachePayment clientCustomerSaleCachePaymentResult = (ClientCustomerSaleCachePayment) saveOrUpdate(clientCustomerSaleCachePaymentTransformer.reverseTransform(clientCustomerSaleCachePaymentDto));
        return clientCustomerSaleCachePaymentTransformer.transform(clientCustomerSaleCachePaymentResult);
    }
}
