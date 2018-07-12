package com.aplos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Created by Aux072 on 22/04/2018.
 */
@Entity
@Table(name = "client_item")
public class ClientItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_item_id", nullable = false)
    private Integer clientItemId;
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    @ManyToOne(optional = false)
    private Client clientId;
    @JoinColumn(name = "item_id", referencedColumnName = "item_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Item itemId;

    public Integer getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(Integer clientItemId) {
        this.clientItemId = clientItemId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }
}