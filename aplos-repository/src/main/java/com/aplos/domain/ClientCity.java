package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Entity
@Table(name = "client_city")
public class ClientCity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_city_id", nullable = false)
    private Long clientCityId;

    @JoinColumn(name = "city_id",  referencedColumnName = "city_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private City cityId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Client clientId;

    @JoinColumn(name = "added_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = true)
    private User addedUserId;

    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    public Long getClientCityId() {
        return clientCityId;
    }

    public void setClientCityId(Long clientCityId) {
        this.clientCityId = clientCityId;
    }

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public User getAddedUserId() {
        return addedUserId;
    }

    public void setAddedUserId(User addedUserId) {
        this.addedUserId = addedUserId;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}
