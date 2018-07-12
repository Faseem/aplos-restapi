package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aux072 on 01/06/2018.
 */
@Entity
@Table(name = "sale_item")
public class SaleItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_item_id")
    private Long saleItemId;

    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    @ManyToOne(optional = false)
    private Item itemId;

    @JoinColumn(name = "sale_id", referencedColumnName = "sale_id")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Sale saleId;

    @JoinColumn(name = "batch_item_id", referencedColumnName = "batch_item_id")
    @ManyToOne(optional = false)
    private BatchItem batchItemId;

    @Column(name = "sale_item_batch_number")
    private String saleItemBatchNumber;

    @Column(name = "sale_item_quantity")
    private Double saleItemQuantity;

    @Column(name = "sale_item_unit_price")
    private Double saleItemUnitPrice;

    @Column(name = "sale_item_discount")
    private Double saleItemDiscount;

    @Column(name = "sale_item_is_discount_percentage")
    private Boolean saleItemIsDiscountPercentage;

    @Column(name = "sale_item_discountedamount")
    private Double saleItemDiscountedamount;

    @Column(name = "sale_item_total_net_pay")
    private Double saleItemTotalNetPay;

    public Long getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(Long saleItemId) {
        this.saleItemId = saleItemId;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
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

    public BatchItem getBatchItemId() {
        return batchItemId;
    }

    public void setBatchItemId(BatchItem batchItemId) {
        this.batchItemId = batchItemId;
    }

    public Sale getSaleId() {
        return saleId;
    }

    public void setSaleId(Sale saleId) {
        this.saleId = saleId;
    }
}
