package com.aplos.dao;

import com.aplos.common.dto.ClientCityDto;
import com.aplos.domain.ClientCity;

import java.util.List;

/**
 * Created by Aux072 on 15/05/2018.
 */
public interface ClientCityDao extends BaseDao<ClientCity> {
    public ClientCityDto addClientCity(ClientCityDto clientCityDto);
    public List<ClientCityDto> getAllCityByClientId(Long clientId);
    public ClientCityDto getCityByNameByClient(String cityName, Long clientId);
}
