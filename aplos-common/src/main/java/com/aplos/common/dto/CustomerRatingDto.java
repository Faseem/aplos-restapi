package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
public class CustomerRatingDto implements Serializable {

    private static final long serialVersionUID = 5820008157862853492L;

    private Long customerRatingId;

    private CustomerDto customerId;

    private RatingDto ratingId;


    public Long getCustomerRatingId() {
        return customerRatingId;
    }

    public void setCustomerRatingId(Long customerRatingId) {
        this.customerRatingId = customerRatingId;
    }

    public CustomerDto getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerDto customerId) {
        this.customerId = customerId;
    }

    public RatingDto getRatingId() {
        return ratingId;
    }

    public void setRatingId(RatingDto ratingId) {
        this.ratingId = ratingId;
    }
}
