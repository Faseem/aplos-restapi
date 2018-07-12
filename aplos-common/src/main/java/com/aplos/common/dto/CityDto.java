package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
public class CityDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long cityId;

    private String cityName;

    private String cityDesc;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityDesc() {
        return cityDesc;
    }

    public void setCityDesc(String cityDesc) {
        this.cityDesc = cityDesc;
    }
}
