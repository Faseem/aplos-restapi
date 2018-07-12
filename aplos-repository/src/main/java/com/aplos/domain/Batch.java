package com.aplos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Created by Aux072 on 22/04/2018.
 */
@Entity
@Table(name = "batch")
public class Batch implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id", nullable = false)
    private Long batchId;

    @Column(name = "batch_date")
    @Temporal(TemporalType.DATE)
    private Date batchDate;

    @Column(name = "batch_total")
    private Double batchTotal;

    @Basic(optional = false)
    @Column(name = "batch_number")
    private String batchNumber;

    @JoinColumn(name = "batch_create_by_user_id", referencedColumnName = "user_id", nullable = false)
    @ManyToOne(optional = false)
    private User batchCreateByUserId;


    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Date getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(Date batchDate) {
        this.batchDate = batchDate;
    }

    public Double getBatchTotal() {
        return batchTotal;
    }

    public void setBatchTotal(Double batchTotal) {
        this.batchTotal = batchTotal;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public User getBatchCreateByUserId() {
        return batchCreateByUserId;
    }

    public void setBatchCreateByUserId(User batchCreateByUserId) {
        this.batchCreateByUserId = batchCreateByUserId;
    }
}
