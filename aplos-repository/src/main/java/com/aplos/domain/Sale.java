package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 01/06/2018.
 */
@Entity
@Table(name = "sale")
public class Sale implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long saleId;

    @Column(name = "sale_number")
    private String saleNumber;

    @Column(name = "sale_date")
    @Temporal(TemporalType.DATE)
    private Date saleDate;

    @Column(name = "sale_total_sale")
    private Double saleTotalSale;

    @Column(name = "sale_discount")
    private Double saleDiscount;

    @Column(name = "sale_discountedamount")
    private Double saleDiscountedamount;

    @Column(name = "sale_is_discount_percentage")
    private Boolean saleIsDiscountPercentage;

    @Column(name = "sale_total_net_pay")
    private Double saleTotalNetPay;

    @Column(name = "sale_status")
    private String saleStatus;

    @Column(name = "sale_pending_amount")
    private Double salePendingAmount;

    @OneToMany(mappedBy = "saleId", cascade = CascadeType.ALL)
    private List<SaleItem> saleItems;


    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public String getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Double getSaleTotalSale() {
        return saleTotalSale;
    }

    public void setSaleTotalSale(Double saleTotalSale) {
        this.saleTotalSale = saleTotalSale;
    }

    public Double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(Double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public Double getSaleDiscountedamount() {
        return saleDiscountedamount;
    }

    public void setSaleDiscountedamount(Double saleDiscountedamount) {
        this.saleDiscountedamount = saleDiscountedamount;
    }

    public Boolean getSaleIsDiscountPercentage() {
        return saleIsDiscountPercentage;
    }

    public void setSaleIsDiscountPercentage(Boolean saleIsDiscountPercentage) {
        this.saleIsDiscountPercentage = saleIsDiscountPercentage;
    }

    public Double getSaleTotalNetPay() {
        return saleTotalNetPay;
    }

    public void setSaleTotalNetPay(Double saleTotalNetPay) {
        this.saleTotalNetPay = saleTotalNetPay;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(List<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Double getSalePendingAmount() {
        return salePendingAmount;
    }

    public void setSalePendingAmount(Double salePendingAmount) {
        this.salePendingAmount = salePendingAmount;
    }
}
