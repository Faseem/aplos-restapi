package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
public class RatingDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long ratingId;

    private String ratingName;

    private String ratingDescription;

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public String getRatingName() {
        return ratingName;
    }

    public void setRatingName(String ratingName) {
        this.ratingName = ratingName;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }
}
