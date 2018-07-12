package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientBatchDto implements Serializable {

    private static final long serialVersionUID = 5820008157862853492L;

    private Integer clientBatchId;
    private BatchDto batchId;
    private ClientDto clientId;

    public Integer getClientBatchId() {
        return clientBatchId;
    }

    public void setClientBatchId(Integer clientBatchId) {
        this.clientBatchId = clientBatchId;
    }

    public BatchDto getBatchId() {
        return batchId;
    }

    public void setBatchId(BatchDto batchId) {
        this.batchId = batchId;
    }

    public ClientDto getClientId() {
        return clientId;
    }

    public void setClientId(ClientDto clientId) {
        this.clientId = clientId;
    }
}
