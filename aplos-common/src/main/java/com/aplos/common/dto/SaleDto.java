package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 04/06/2018.
 */
public class SaleDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long saleId;
    private String saleNumber;
    private Date saleDate;
    private Double saleTotalSale;
    private Double saleDiscount;
    private Double saleDiscountedamount;
    private Boolean saleIsDiscountPercentage;
    private Double saleTotalNetPay;
    private String saleStatus;
    private Double salePendingAmount;
    private List<SaleItemDto> saleItems;

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

    public List<SaleItemDto> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(List<SaleItemDto> saleItems) {
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
