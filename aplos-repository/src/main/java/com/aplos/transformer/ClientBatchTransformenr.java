package com.aplos.transformer;

import com.aplos.common.dto.ClientBatchDto;
import com.aplos.domain.ClientBatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 01/05/2018.
 */
@Service
public class ClientBatchTransformenr implements BaseTransformer<ClientBatch, ClientBatchDto> {

    @Autowired
    BatchTransformaer batchTransformaer;

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Override
    public ClientBatchDto transform(ClientBatch clientBatch) {
        ClientBatchDto clientBatchDto = new ClientBatchDto();
        clientBatchDto.setBatchId(batchTransformaer.transform(clientBatch.getBatchId()));
        clientBatchDto.setClientId(clientTrasformenr.transform(clientBatch.getClientId()));
        clientBatchDto.setClientBatchId(clientBatch.getClientBatchId());
        return clientBatchDto;
    }

    @Override
    public ClientBatch reverseTransform(ClientBatchDto clientBatchDto) {
        ClientBatch clientBatch = new ClientBatch();
        clientBatch.setBatchId(batchTransformaer.reverseTransform(clientBatchDto.getBatchId()));
        clientBatch.setClientId(clientTrasformenr.reverseTransform(clientBatchDto.getClientId()));
        clientBatch.setClientBatchId(clientBatchDto.getClientBatchId());
        return clientBatch;
    }
}
