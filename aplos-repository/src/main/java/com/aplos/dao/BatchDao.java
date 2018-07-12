package com.aplos.dao;

import com.aplos.common.dto.BatchDto;
import com.aplos.domain.Batch;

import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
public interface BatchDao extends BaseDao<Batch> {
    public BatchDto addClientItem(BatchDto clientItemDto);
    public List<BatchDto> getAllBatchesForClient(Long clientId);
}
