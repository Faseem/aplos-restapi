package com.aplos.dao.impl;

import com.aplos.common.dto.ClientCustomerDto;
import com.aplos.dao.ClientCustomerDao;
import com.aplos.domain.ClientCustomer;
import com.aplos.transformer.ClientCustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Repository
public class ClientCustomerDaoImpl  extends BaseDaoImpl<ClientCustomer> implements ClientCustomerDao {

    @Autowired
    ClientCustomerTransformer clientCustomerTransformer;

    @Override
    @Transactional
    public ClientCustomerDto addClientCustomer(ClientCustomerDto clientCustomerDto) {
        ClientCustomer clientCustomerResult = (ClientCustomer) saveOrUpdate(clientCustomerTransformer.reverseTransform(clientCustomerDto));
        return clientCustomerTransformer.transform(clientCustomerResult);
    }
}
