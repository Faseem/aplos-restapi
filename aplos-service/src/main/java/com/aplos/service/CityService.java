package com.aplos.service;

import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 08/05/2018.
 */
public interface CityService {
    public ResponseDto getAllCity();
    public ResponseDto getCityByName(String cityName);
    public ResponseDto getAllCityByClientId(Long clientId);
    public ResponseDto getCityByNameByClient(String cityName, Long clientId);
}
