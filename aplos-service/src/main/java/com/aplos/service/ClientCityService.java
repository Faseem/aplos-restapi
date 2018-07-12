package com.aplos.service;

import com.aplos.common.dto.ClientCityDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 15/05/2018.
 */
public interface ClientCityService {
    public ResponseDto addClientCity(ClientCityDto clientCityDto);
    public ResponseDto getAllCityByClientId(Long clientId);
    public ResponseDto getCityByNameByClient(String cityName, Long clientId);
}
