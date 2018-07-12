package com.aplos.service;

import com.aplos.common.dto.CustomerRatingDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 17/05/2018.
 */
public interface CustomerRatingService {
    public ResponseDto addCustomerRating(CustomerRatingDto customerRatingDto);
}
