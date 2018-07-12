package com.aplos.dao;

import com.aplos.common.dto.ClientDto;
import com.aplos.domain.Client;

/**
 * Created by Aux072 on 06/06/2018.
 */
public interface ClientDao extends BaseDao<Client> {
    public ClientDto getClientByClientId(Long clientId);
}
