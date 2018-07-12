package com.aplos.dao.impl;

import com.aplos.common.dto.CustomerRatingDto;
import com.aplos.dao.CustomerRatingDao;
import com.aplos.domain.CustomerRating;
import com.aplos.transformer.CustomerAddressTransfomer;
import com.aplos.transformer.CustomerRatingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Aux072 on 17/05/2018.
 */
@Repository
public class CustomerRatingDaoImpl extends BaseDaoImpl<CustomerRating> implements CustomerRatingDao {

    @Autowired
    CustomerRatingTransformer customerRatingTransformer;

    @Override
    @Transactional
    public CustomerRatingDto addCustomerRating(CustomerRatingDto customerRatingDto) {
        CustomerRating customerRating = customerRatingTransformer.reverseTransform(customerRatingDto);
        CustomerRating customerRatingResult = saveOrUpdate(customerRating);
        CustomerRatingDto customerRatingDtoResult = customerRatingTransformer.transform(customerRatingResult);
        return customerRatingDtoResult;
    }
}
