package com.aplos.transformer;

import com.aplos.common.dto.BatchDto;
import com.aplos.common.dto.ClientBatchDto;
import com.aplos.domain.Batch;
import com.aplos.domain.BatchItem;
import com.aplos.domain.ClientBatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 30/04/2018.
 */
@Service
public class BatchTransformaer implements BaseTransformer<Batch, BatchDto>{

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    BatchItemTransformer batchItemTransformer;

    @Autowired
    ClientBatchTransformenr clientBatchTransformenr;

    @Override
    public BatchDto transform(Batch batch) {
        BatchDto batchDto = new BatchDto();
        batchDto.setBatchCreateByUserId(userTransformer.transform(batch.getBatchCreateByUserId()));
        batchDto.setBatchDate(batch.getBatchDate());
        batchDto.setBatchId(batch.getBatchId());
        batchDto.setBatchNumber(batch.getBatchNumber());
        batchDto.setBatchTotal(batch.getBatchTotal());

        return batchDto;
    }

    @Override
    public Batch reverseTransform(BatchDto batchDto) {
        Batch batch = new Batch();
        batch.setBatchCreateByUserId(userTransformer.reverseTransform(batchDto.getBatchCreateByUserId()));
        batch.setBatchDate(batchDto.getBatchDate());
        batch.setBatchId(batchDto.getBatchId());
        batch.setBatchNumber(batchDto.getBatchNumber());
        batch.setBatchTotal(batchDto.getBatchTotal());
        return batch;
    }
}
