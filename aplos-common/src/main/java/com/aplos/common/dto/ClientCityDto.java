package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 15/05/2018.
 */
public class ClientCityDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long clientCityId;
    private ClientDto clientId;
    private CityDto cityId;
    private UserDto addedUserId;
    private Date addedDate;

    public void setClientCityId(Long clientCityId) {
        this.clientCityId = clientCityId;
    }

    public ClientDto getClientId() {
        return clientId;
    }

    public void setClientId(ClientDto clientId) {
        this.clientId = clientId;
    }

    public CityDto getCityId() {
        return cityId;
    }

    public void setCityId(CityDto cityId) {
        this.cityId = cityId;
    }

    public Long getClientCityId() {
        return clientCityId;
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
