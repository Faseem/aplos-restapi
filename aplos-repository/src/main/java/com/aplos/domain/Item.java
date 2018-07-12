package com.aplos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Created by Aux072 on 22/04/2018.
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id", nullable = false)
    private Long itemId;

    @Column(name = "item_name", length = 45)
    private String itemName;

    @Column(name = "item_description", length = 200)
    private String itemDescription;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemId")
    private List<ClientItem> clientItemList;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public List<ClientItem> getClientItemList() {
        return clientItemList;
    }

    public void setClientItemList(List<ClientItem> clientItemList) {
        this.clientItemList = clientItemList;
    }
}
