package com.aplos.dao;

import com.aplos.common.dto.CustomerRatingDto;
import com.aplos.domain.CustomerRating;

/**
 * Created by Aux072 on 17/05/2018.
 */
public interface CustomerRatingDao extends BaseDao<CustomerRating> {
    public CustomerRatingDto addCustomerRating(CustomerRatingDto customerRatingDto);
}
