package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 15/05/2018.
 */
public class ClientRatingDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long clientRatingId;
    private ClientDto clientId;
    private RatingDto ratingId;
    private UserDto addedUserId;
    private Date addedDate;

    public Long getClientRatingId() {
        return clientRatingId;
    }

    public void setClientRatingId(Long clientRatingId) {
        this.clientRatingId = clientRatingId;
    }

    public ClientDto getClientId() {
        return clientId;
    }

    public void setClientId(ClientDto clientId) {
        this.clientId = clientId;
    }

    public RatingDto getRatingId() {
        return ratingId;
    }

    public void setRatingId(RatingDto ratingId) {
        this.ratingId = ratingId;
    }

    public UserDto getAddedUserId() {
        return addedUserId;
    }

    public void setAddedUserId(UserDto addedUserId) {
        this.addedUserId = addedUserId;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}
