package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
@Entity
@Table(name = "customer_rating")
public class CustomerRating implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_rating_id")
    private Long customerRatingId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customerId;

    @JoinColumn(name = "rating_id", referencedColumnName = "rating_id")
    @ManyToOne(optional = false)
    private Rating ratingId;

    public Long getCustomerRatingId() {
        return customerRatingId;
    }

    public void setCustomerRatingId(Long customerRatingId) {
        this.customerRatingId = customerRatingId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Rating getRatingId() {
        return ratingId;
    }

    public void setRatingId(Rating ratingId) {
        this.ratingId = ratingId;
    }
}
