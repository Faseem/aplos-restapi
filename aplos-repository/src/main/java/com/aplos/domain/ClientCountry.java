package com.aplos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "client_country")
public class ClientCountry implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_country_id")
    private Long clientCountryId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne(optional = true)
    private Client client;

    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne(optional = true)
    private Country country;

    public Long getClientCountryId() {
        return clientCountryId;
    }

    public void setClientCountryId(Long clientCountryId) {
        this.clientCountryId = clientCountryId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
