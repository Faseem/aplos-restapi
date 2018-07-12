package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aux072 on 10/06/2018.
 */
@Entity
@Table(name = "bank")
public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id", nullable = false)
    private Long bankId;

    @Column(name = "bank_name")
    private String bankName;

    @Basic(optional = false)
    @Column(name = "bank_description")
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
