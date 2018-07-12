package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 02/06/2018.
 */
public class CustomerSalesExtraInfoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long customerSalesExtraInfoId;

    private CustomerDto customerId;

    private Double customerSalesExtraInfoTotalSalel;

    private Date customerSalesExtraInfoLasttransactionDate;

    private Double customerSalesExtraInfoTotalDiscounts;

    private Double customerSalesExtraInfoBalanceOutstanding;

    private Double customerSalesExtraInfoTotalChequepayements;

    private Double customerSalesExtraInfoTotalPendingchequepayment;

    private String customerSalesExtraInfoLastTransaction;

    public Long getCustomerSalesExtraInfoId() {
        return customerSalesExtraInfoId;
    }

    public void setCustomerSalesExtraInfoId(Long customerSalesExtraInfoId) {
        this.customerSalesExtraInfoId = customerSalesExtraInfoId;
    }

    public CustomerDto getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerDto customerId) {
        this.customerId = customerId;
    }

    public Double getCustomerSalesExtraInfoTotalSalel() {
        return customerSalesExtraInfoTotalSalel;
    }

    public void setCustomerSalesExtraInfoTotalSalel(Double customerSalesExtraInfoTotalSalel) {
        this.customerSalesExtraInfoTotalSalel = customerSalesExtraInfoTotalSalel;
    }

    public Date getCustomerSalesExtraInfoLasttransactionDate() {
        return customerSalesExtraInfoLasttransactionDate;
    }

    public void setCustomerSalesExtraInfoLasttransactionDate(Date customerSalesExtraInfoLasttransactionDate) {
        this.customerSalesExtraInfoLasttransactionDate = customerSalesExtraInfoLasttransactionDate;
    }

    public Double getCustomerSalesExtraInfoTotalDiscounts() {
        return customerSalesExtraInfoTotalDiscounts;
    }

    public void setCustomerSalesExtraInfoTotalDiscounts(Double customerSalesExtraInfoTotalDiscounts) {
        this.customerSalesExtraInfoTotalDiscounts = customerSalesExtraInfoTotalDiscounts;
    }

    public Double getCustomerSalesExtraInfoBalanceOutstanding() {
        return customerSalesExtraInfoBalanceOutstanding;
    }

    public void setCustomerSalesExtraInfoBalanceOutstanding(Double customerSalesExtraInfoBalanceOutstanding) {
        this.customerSalesExtraInfoBalanceOutstanding = customerSalesExtraInfoBalanceOutstanding;
    }

    public Double getCustomerSalesExtraInfoTotalChequepayements() {
        return customerSalesExtraInfoTotalChequepayements;
    }

    public void setCustomerSalesExtraInfoTotalChequepayements(Double customerSalesExtraInfoTotalChequepayements) {
        this.customerSalesExtraInfoTotalChequepayements = customerSalesExtraInfoTotalChequepayements;
    }

    public Double getCustomerSalesExtraInfoTotalPendingchequepayment() {
        return customerSalesExtraInfoTotalPendingchequepayment;
    }

    public void setCustomerSalesExtraInfoTotalPendingchequepayment(Double customerSalesExtraInfoTotalPendingchequepayment) {
        this.customerSalesExtraInfoTotalPendingchequepayment = customerSalesExtraInfoTotalPendingchequepayment;
    }

    public String getCustomerSalesExtraInfoLastTransaction() {
        return customerSalesExtraInfoLastTransaction;
    }

    public void setCustomerSalesExtraInfoLastTransaction(String customerSalesExtraInfoLastTransaction) {
        this.customerSalesExtraInfoLastTransaction = customerSalesExtraInfoLastTransaction;
    }
}
