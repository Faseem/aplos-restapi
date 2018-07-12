package com.aplos.dao;

import com.aplos.common.dto.ClientCustomerDto;
import com.aplos.domain.ClientCustomer;
import org.springframework.stereotype.Repository;

/**
 * Created by Aux072 on 08/05/2018.
 */
public interface ClientCustomerDao extends BaseDao<ClientCustomer>  {
    public ClientCustomerDto addClientCustomer(ClientCustomerDto clientCustomerDto);
}
