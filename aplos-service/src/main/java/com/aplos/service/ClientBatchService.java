package com.aplos.service;

import com.aplos.common.dto.ClientBatchDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 02/05/2018.
 */
public interface ClientBatchService {
    public ResponseDto addClientBatch(ClientBatchDto clientBatchDto);
}
