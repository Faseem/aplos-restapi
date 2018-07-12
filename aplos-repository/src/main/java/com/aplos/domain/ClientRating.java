package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Entity
@Table(name = "client_rating")
public class ClientRating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_rating_id", nullable = false)
    private Long clientRatingId;

    @JoinColumn(name = "rating_id",  referencedColumnName = "rating_id", nullable = false)
    @ManyToOne(optional = false)
    private Rating ratingId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    @ManyToOne(optional = false)
    private Client clientId;

    @JoinColumn(name = "created_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = true)
    private User addedUserId;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    public Long getClientRatingId() {
        return clientRatingId;
    }

    public void setClientRatingId(Long clientRatingId) {
        this.clientRatingId = clientRatingId;
    }

    public Rating getRatingId() {
        return ratingId;
    }

    public void setRatingId(Rating ratingId) {
        this.ratingId = ratingId;
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
