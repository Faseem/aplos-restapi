package com.aplos.domain;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Created by Aux072 on 22/04/2018.
 */
@Entity
@Table(name = "batch_item")
public class BatchItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "batch_item_id",  nullable = false, unique = true)
    private Long batchItemId;

    @Column(name = "batch_item_quantity")
    private Double batchItemQuantity;

    @Column(name = "batch_item_manufactured_date")
    @Temporal(TemporalType.DATE)
    private Date batchItemManufacturedDate;

    @Column(name = "batch_item_expired_date")
    @Temporal(TemporalType.DATE)
    private Date batchItemExpiredDate;


    @Column(name = "batch_item_unit_price", precision = 22)
    private Double batchItemUnitPrice;


    @Column(name = "batch_item_selling_price", precision = 22)
    private Double batchItemSellingPrice;


    @Column(name = "batch_item_description", length = 200)
    private String batchItemDescription;

    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    @ManyToOne(optional = false)
    private Item itemId;

    @JoinColumn(name = "batch_id", referencedColumnName = "batch_id")
    @ManyToOne(optional = false)
    private Batch batchId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = false)
    private Client clientId;

    public Double getBatchItemQuantity() {
        return batchItemQuantity;
    }

    public void setBatchItemQuantity(Double batchItemQuantity) {
        this.batchItemQuantity = batchItemQuantity;
    }

    public Date getBatchItemManufacturedDate() {
        return batchItemManufacturedDate;
    }

    public void setBatchItemManufacturedDate(Date batchItemManufacturedDate) {
        this.batchItemManufacturedDate = batchItemManufacturedDate;
    }

    public Date getBatchItemExpiredDate() {
        return batchItemExpiredDate;
    }

    public void setBatchItemExpiredDate(Date batchItemExpiredDate) {
        this.batchItemExpiredDate = batchItemExpiredDate;
    }

    public Double getBatchItemUnitPrice() {
        return batchItemUnitPrice;
    }

    public void setBatchItemUnitPrice(Double batchItemUnitPrice) {
        this.batchItemUnitPrice = batchItemUnitPrice;
    }

    public Double getBatchItemSellingPrice() {
        return batchItemSellingPrice;
    }

    public void setBatchItemSellingPrice(Double batchItemSellingPrice) {
        this.batchItemSellingPrice = batchItemSellingPrice;
    }

    public String getBatchItemDescription() {
        return batchItemDescription;
    }

    public void setBatchItemDescription(String batchItemDescription) {
        this.batchItemDescription = batchItemDescription;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }

    public Batch getBatchId() {
        return batchId;
    }

    public void setBatchId(Batch batchId) {
        this.batchId = batchId;
    }

    public Long getBatchItemId() {
        return batchItemId;
    }

    public void setBatchItemId(Long batchItemId) {
        this.batchItemId = batchItemId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}
