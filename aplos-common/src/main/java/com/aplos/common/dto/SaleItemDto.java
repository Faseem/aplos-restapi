package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 04/06/2018.
 */
public class SaleItemDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long saleItemId;
    private ItemDto itemId;
    private SaleDto saleId;
    private BatchItemDto batchItemId;
    private String saleItemBatchNumber;
    private Double saleItemQuantity;
    private Double saleItemUnitPrice;
    private Double saleItemDiscount;
    private Boolean saleItemIsDiscountPercentage;
    private Double saleItemDiscountedamount;
    private Double saleItemTotalNetPay;

    public Long getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(Long saleItemId) {
        this.saleItemId = saleItemId;
    }

    public ItemDto getItemId() {
        return itemId;
    }

    public void setItemId(ItemDto itemId) {
        this.itemId = itemId;
    }

    public String getSaleItemBatchNumber() {
        return saleItemBatchNumber;
    }

    public void setSaleItemBatchNumber(String saleItemBatchNumber) {
        this.saleItemBatchNumber = saleItemBatchNumber;
    }

    public Double getSaleItemQuantity() {
        return saleItemQuantity;
    }

    public void setSaleItemQuantity(Double saleItemQuantity) {
        this.saleItemQuantity = saleItemQuantity;
    }

    public Double getSaleItemUnitPrice() {
        return saleItemUnitPrice;
    }

    public void setSaleItemUnitPrice(Double saleItemUnitPrice) {
        this.saleItemUnitPrice = saleItemUnitPrice;
    }

    public Double getSaleItemDiscount() {
        return saleItemDiscount;
    }

    public void setSaleItemDiscount(Double saleItemDiscount) {
        this.saleItemDiscount = saleItemDiscount;
    }

    public Boolean getSaleItemIsDiscountPercentage() {
        return saleItemIsDiscountPercentage;
    }

    public void setSaleItemIsDiscountPercentage(Boolean saleItemIsDiscountPercentage) {
        this.saleItemIsDiscountPercentage = saleItemIsDiscountPercentage;
    }

    public Double getSaleItemDiscountedamount() {
        return saleItemDiscountedamount;
    }

    public void setSaleItemDiscountedamount(Double saleItemDiscountedamount) {
        this.saleItemDiscountedamount = saleItemDiscountedamount;
    }

    public Double getSaleItemTotalNetPay() {
        return saleItemTotalNetPay;
    }

    public void setSaleItemTotalNetPay(Double saleItemTotalNetPay) {
        this.saleItemTotalNetPay = saleItemTotalNetPay;
    }

    public BatchItemDto getBatchItemId() {
        return batchItemId;
    }

    public void setBatchItemId(BatchItemDto batchItemId) {
        this.batchItemId = batchItemId;
    }

    public SaleDto getSaleId() {
        return saleId;
    }

    public void setSaleId(SaleDto saleId) {
        this.saleId = saleId;
    }
}
