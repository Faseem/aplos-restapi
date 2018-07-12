package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 10/06/2018.
 */
public class ClientBankDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long clientBankId;
    private ClientDto clientId;
    private BankDto bankId;
    private UserDto addedUserId;
    private Date assignedDate;

    public Long getClientBankId() {
        return clientBankId;
    }

    public void setClientBankId(Long clientBankId) {
        this.clientBankId = clientBankId;
    }

    public ClientDto getClientId() {
        return clientId;
    }

    public void setClientId(ClientDto clientId) {
        this.clientId = clientId;
    }

    public BankDto getBankId() {
        return bankId;
    }

    public void setBankId(BankDto bankId) {
        this.bankId = bankId;
    }

    public UserDto getAddedUserId() {
        return addedUserId;
    }

    public void setAddedUserId(UserDto addedUserId) {
        this.addedUserId = addedUserId;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }
}
