package com.aplos.dao.impl;

import com.aplos.common.dto.ClientBatchDto;
import com.aplos.dao.ClientBatchDao;
import com.aplos.domain.ClientBatch;
import com.aplos.transformer.ClientBatchTransformenr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Aux072 on 02/05/2018.
 */
@Repository
public class ClientBatchDaoImpl  extends BaseDaoImpl<ClientBatch> implements ClientBatchDao {

    @Autowired
    ClientBatchTransformenr clientBatchTransformenr;

    @Override
    @Transactional
    public ClientBatchDto addClientBatch(ClientBatchDto clientBatchDto) {
        ClientBatch clientBatchResult = (ClientBatch) saveOrUpdate(clientBatchTransformenr.reverseTransform(clientBatchDto));
        return clientBatchTransformenr.transform(clientBatchResult);
    }

}
