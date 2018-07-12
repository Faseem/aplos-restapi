package com.aplos.dao.impl;

import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.dao.ClientCustomerSaleOtherPaymentDao;
import com.aplos.domain.ClientCustomerSaleOtherPayment;
import com.aplos.transformer.ClientCustomerSaleOtherPaymentTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 04/07/2018.
 */
@Repository
public class ClientCustomerSaleOtherPaymentDaoImpl   extends BaseDaoImpl<ClientCustomerSaleOtherPayment> implements ClientCustomerSaleOtherPaymentDao {
    @Autowired
    ClientCustomerSaleOtherPaymentTransformer clientCustomerSaleOtherPaymentTransformer;

    @Override
    public List<ClientCustomerSaleOtherPaymentDto> getClientCustomerOtherPayment(Long clientId, Long customerId, Long saleId) {

        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSaleOtherPayment.class);

        criteria.createAlias("clientId", "clientId");
        criteria.createAlias("customerId", "customerId");
        criteria.createAlias("saleId", "saleId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        criteria.add(Restrictions.eq("saleId.saleId", saleId));
        List<ClientCustomerSaleOtherPayment> clientCustomerSaleOtherPayments = criteria.list();
        List<ClientCustomerSaleOtherPaymentDto> otherPaymentsToRet = new ArrayList<>();
        if(clientCustomerSaleOtherPayments!=null && clientCustomerSaleOtherPayments.size()>0){
            for(ClientCustomerSaleOtherPayment clientCustomerSaleOtherPayment: clientCustomerSaleOtherPayments){
                otherPaymentsToRet.add(clientCustomerSaleOtherPaymentTransformer.transform(clientCustomerSaleOtherPayment));
            }
        }
        return otherPaymentsToRet;
    }

    @Override
    @Transactional
    public ClientCustomerSaleOtherPaymentDto addClientCustomerSaleOtherPayment(ClientCustomerSaleOtherPaymentDto clientCustomerSaleOtherPaymentDto) {
        ClientCustomerSaleOtherPayment clientCustomerSaleOtherPaymentResult = (ClientCustomerSaleOtherPayment) saveOrUpdate(clientCustomerSaleOtherPaymentTransformer.reverseTransform(clientCustomerSaleOtherPaymentDto));
        return clientCustomerSaleOtherPaymentTransformer.transform(clientCustomerSaleOtherPaymentResult);
    }
}
