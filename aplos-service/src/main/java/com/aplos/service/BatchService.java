package com.aplos.service;

import com.aplos.common.dto.BatchDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 30/04/2018.
 */
public interface BatchService {
    public ResponseDto addBatch(BatchDto batchDto);
    public ResponseDto getAllBatchesForClient(Long clientId);
}
