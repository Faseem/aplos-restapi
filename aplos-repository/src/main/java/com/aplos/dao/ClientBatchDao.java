package com.aplos.dao;

import com.aplos.common.dto.ClientBatchDto;
import com.aplos.domain.ClientBatch;

/**
 * Created by Aux072 on 02/05/2018.
 */
public interface ClientBatchDao extends BaseDao<ClientBatch> {
    public ClientBatchDto addClientBatch(ClientBatchDto clientBatchDto);
}
