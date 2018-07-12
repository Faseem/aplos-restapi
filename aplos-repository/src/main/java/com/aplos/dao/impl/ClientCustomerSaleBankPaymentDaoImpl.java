package com.aplos.dao.impl;

import com.aplos.common.dto.ClientCustomerSaleBankPaymentDto;
import com.aplos.common.dto.ClientCustomerSaleOtherPaymentDto;
import com.aplos.dao.ClientCustomerSaleBankPaymentDao;
import com.aplos.dao.ClientCustomerSaleOtherPaymentDao;
import com.aplos.domain.ClientCustomerSaleBankPayment;
import com.aplos.domain.ClientCustomerSaleOtherPayment;
import com.aplos.transformer.ClientCustomerSaleBankPaymentTransformer;
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
public class ClientCustomerSaleBankPaymentDaoImpl extends BaseDaoImpl<ClientCustomerSaleBankPayment> implements ClientCustomerSaleBankPaymentDao {
    @Autowired
    ClientCustomerSaleBankPaymentTransformer clientCustomerSaleBankPaymentTransformer;

    @Override
    public List<ClientCustomerSaleBankPaymentDto> getClientCustomerBankPayment(Long clientId, Long customerId, Long saleId) {

        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSaleBankPayment.class);

        criteria.createAlias("clientId", "clientId");
        criteria.createAlias("customerId", "customerId");
        criteria.createAlias("saleId", "saleId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        criteria.add(Restrictions.eq("saleId.saleId", saleId));
        List<ClientCustomerSaleBankPayment> clientCustomerSaleBankPayments = criteria.list();
        List<ClientCustomerSaleBankPaymentDto> bankPaymentsToRet = new ArrayList<>();
        if(clientCustomerSaleBankPayments!=null && clientCustomerSaleBankPayments.size()>0){
            for(ClientCustomerSaleBankPayment clientCustomerSaleBankPayment: clientCustomerSaleBankPayments){
                bankPaymentsToRet.add(clientCustomerSaleBankPaymentTransformer.transform(clientCustomerSaleBankPayment));
            }
        }
        return bankPaymentsToRet;
    }

    @Override
    @Transactional
    public ClientCustomerSaleBankPaymentDto addClientCustomerSaleBankPayment(ClientCustomerSaleBankPaymentDto clientCustomerSaleBankPaymentDto) {
        ClientCustomerSaleBankPayment clientCustomerSaleBankPaymentResult = (ClientCustomerSaleBankPayment) saveOrUpdate(clientCustomerSaleBankPaymentTransformer.reverseTransform(clientCustomerSaleBankPaymentDto));
        return clientCustomerSaleBankPaymentTransformer.transform(clientCustomerSaleBankPaymentResult);
    }
}
