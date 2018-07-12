package com.aplos.transformer;

import com.aplos.common.dto.CityDto;
import com.aplos.domain.City;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class CityTransformer implements BaseTransformer<City, CityDto> {
    @Override
    public CityDto transform(City city) {
        CityDto cityDto = new CityDto();
        cityDto.setCityName(city.getCityName());
        cityDto.setCityDesc(city.getCityDesc());
        cityDto.setCityId(city.getCityId());
        return cityDto;
    }

    @Override
    public City reverseTransform(CityDto cityDto) {
        City city = new City();
        city.setCityName(cityDto.getCityName());
        city.setCityDesc(cityDto.getCityDesc());
        city.setCityId(cityDto.getCityId());
        return city;
    }
}
