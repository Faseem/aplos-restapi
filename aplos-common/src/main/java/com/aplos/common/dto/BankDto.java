package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 10/06/2018.
 */
public class BankDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long bankId;
    private String bankName;
    private String bankDescription;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankDescription() {
        return bankDescription;
    }

    public void setBankDescription(String bankDescription) {
        this.bankDescription = bankDescription;
    }
}
