package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 02/06/2018.
 */
@Entity
@Table(name = "customer_sales_extra_info")
public class CustomerSalesExtraInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_sales_extra_info_id")
    private Long customerSalesExtraInfoId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customerId;

    @Column(name = "customer_sales_extra_info_total_salel")
    private Double customerSalesExtraInfoTotalSalel;

    @Column(name = "customer_sales_extra_info_lasttransaction_date")
    @Temporal(TemporalType.DATE)
    private Date customerSalesExtraInfoLasttransactionDate;

    @Column(name = "customer_sales_extra_info_total_discounts")
    private Double customerSalesExtraInfoTotalDiscounts;

    @Column(name = "customer_sales_extra_info_balance_outstanding")
    private Double customerSalesExtraInfoBalanceOutstanding;

    @Column(name = "customer_sales_extra_info_total_chequepayements")
    private Double customerSalesExtraInfoTotalChequepayements;

    @Column(name = "customer_sales_extra_info_total_pendingchequepayment")
    private Double customerSalesExtraInfoTotalPendingchequepayment;

    @Column(name = "customer_sales_extra_info_last_transaction")
    private String customerSalesExtraInfoLastTransaction;

    public Long getCustomerSalesExtraInfoId() {
        return customerSalesExtraInfoId;
    }

    public void setCustomerSalesExtraInfoId(Long customerSalesExtraInfoId) {
        this.customerSalesExtraInfoId = customerSalesExtraInfoId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
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
