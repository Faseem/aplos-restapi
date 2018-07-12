package com.aplos.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class CountryDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Integer countryId;
    private String countryName;
    private String countryCode;
    private List<ClientCountryDto> clientCountryList;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<ClientCountryDto> getClientCountryList() {
        return clientCountryList;
    }

    public void setClientCountryList(List<ClientCountryDto> clientCountryList) {
        this.clientCountryList = clientCountryList;
    }
}
