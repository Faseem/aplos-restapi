package com.aplos.dao.impl;

import com.aplos.common.dto.BatchDto;
import com.aplos.dao.BaseDao;
import com.aplos.dao.BatchDao;
import com.aplos.domain.Batch;
import com.aplos.domain.ClientBatch;
import com.aplos.transformer.BatchTransformaer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@Repository
public class BatchDaoImpl extends BaseDaoImpl<Batch> implements BatchDao {
    @Autowired
    BatchTransformaer batchTransformaer;

    @Override
    @Transactional
    public BatchDto addClientItem(BatchDto batchDto) {
        Batch batch = batchTransformaer.reverseTransform(batchDto);
        Batch batchResult = saveOrUpdate(batch);
        BatchDto batchResultToRet = batchTransformaer.transform(batchResult);
        return batchResultToRet;
    }

    @Override
    @Transactional
    public List<BatchDto> getAllBatchesForClient(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientBatch.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        List<BatchDto> batchDtos = new ArrayList<>();
        for (ClientBatch clientBatch : (ArrayList<ClientBatch>)criteria.list()) {
            batchDtos.add(batchTransformaer.transform(clientBatch.getBatchId()));
        }
        return  batchDtos;
    }
}
