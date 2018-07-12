package com.aplos.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Created by Aux072 on 22/04/2018.
 */
@Entity
@Table(name = "client_batch")
public class ClientBatch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_batch_id", nullable = false)
    private Integer clientBatchId;

    @JoinColumn(name = "batch_id",  referencedColumnName = "batch_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Batch batchId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Client clientId;

    public Integer getClientBatchId() {
        return clientBatchId;
    }

    public void setClientBatchId(Integer clientBatchId) {
        this.clientBatchId = clientBatchId;
    }

    public Batch getBatchId() {
        return batchId;
    }

    public void setBatchId(Batch batchId) {
        this.batchId = batchId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}
