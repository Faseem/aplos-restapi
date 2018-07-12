package com.aplos.common.dto;

import sun.rmi.runtime.Log;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class BatchItemDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long batchItemId;
    private Double batchItemQuantity;
    private Date batchItemManufacturedDate;
    private Date batchItemExpiredDate;
    private Double batchItemUnitPrice;
    private Double batchItemSellingPrice;
    private String batchItemDescription;
    private ItemDto itemId;
    private BatchDto batchId;
    private ClientDto clientId;

    public Long getBatchItemId() {
        return batchItemId;
    }

    public void setBatchItemId(Long batchItemId) {
        this.batchItemId = batchItemId;
    }

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

    public ItemDto getItemId() {
        return itemId;
    }

    public void setItemId(ItemDto itemId) {
        this.itemId = itemId;
    }

    public BatchDto getBatchId() {
        return batchId;
    }

    public void setBatchId(BatchDto batchId) {
        this.batchId = batchId;
    }

    public ClientDto getClientId() {
        return clientId;
    }

    public void setClientId(ClientDto clientId) {
        this.clientId = clientId;
    }
}
