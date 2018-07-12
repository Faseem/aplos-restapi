package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class BatchDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long batchId;
    private Date batchDate;
    private Double batchTotal;
    private String batchNumber;
    private UserDto batchCreateByUserId;

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

    public UserDto getBatchCreateByUserId() {
        return batchCreateByUserId;
    }

    public void setBatchCreateByUserId(UserDto batchCreateByUserId) {
        this.batchCreateByUserId = batchCreateByUserId;
    }
}
