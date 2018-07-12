package com.aplos.transformer;

import com.aplos.common.dto.ClientCityDto;
import com.aplos.domain.ClientCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Service
public class ClientCityTransformer implements BaseTransformer<ClientCity, ClientCityDto> {

    @Autowired
    CityTransformer cityTransformer;

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Override
    public ClientCityDto transform(ClientCity clientCity) {
        ClientCityDto clientCityDto =new ClientCityDto();
        clientCityDto.setClientCityId(clientCity.getClientCityId());
        clientCityDto.setAddedDate(clientCity.getAddedDate());
        clientCityDto.setClientId(clientTrasformenr.transform(clientCity.getClientId()));
        clientCityDto.setAddedUserId(userTransformer.transform(clientCity.getAddedUserId()));
        clientCityDto.setCityId(cityTransformer.transform(clientCity.getCityId()));
        return clientCityDto;
    }

    @Override
    public ClientCity reverseTransform(ClientCityDto clientCityDto) {
        ClientCity clientCity =new ClientCity();
        clientCity.setClientCityId(clientCityDto.getClientCityId());
        clientCity.setAddedDate(clientCityDto.getAddedDate());
        clientCity.setClientId(clientTrasformenr.reverseTransform(clientCityDto.getClientId()));
        clientCity.setAddedUserId(userTransformer.reverseTransform(clientCityDto.getAddedUserId()));
        clientCity.setCityId(cityTransformer.reverseTransform(clientCityDto.getCityId()));
        return clientCity;
    }
}
