package com.aplos.transformer;

import com.aplos.common.dto.CustomerRatingDto;
import com.aplos.domain.CustomerRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 17/05/2018.
 */
@Service
public class CustomerRatingTransformer implements BaseTransformer<CustomerRating,CustomerRatingDto>{

    @Autowired
    CustomerTransformer customerTransformer;

    @Autowired
    RatingTransformer ratingTransformer;

    @Override
    public CustomerRatingDto transform(CustomerRating customerRating) {
        CustomerRatingDto customerRatingDto = new CustomerRatingDto();
        customerRatingDto.setCustomerRatingId(customerRating.getCustomerRatingId());
        customerRatingDto.setCustomerId(customerTransformer.transform(customerRating.getCustomerId()));
        customerRatingDto.setRatingId(ratingTransformer.transform(customerRating.getRatingId()));
        return customerRatingDto;
    }

    @Override
    public CustomerRating reverseTransform(CustomerRatingDto customerRatingDto) {
        CustomerRating customerRating = new CustomerRating();
        customerRating.setCustomerRatingId(customerRatingDto.getCustomerRatingId());
        customerRating.setCustomerId(customerTransformer.reverseTransform(customerRatingDto.getCustomerId()));
        customerRating.setRatingId(ratingTransformer.reverseTransform(customerRatingDto.getRatingId()));
        return customerRating;
    }
}
