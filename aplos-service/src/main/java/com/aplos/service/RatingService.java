package com.aplos.service;

import com.aplos.common.dto.RatingDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 08/05/2018.
 */
public interface RatingService  {
    public ResponseDto addRating(RatingDto ratingDto);
    public ResponseDto getAllRatings();
    public ResponseDto getAllRatingByClientId(Long clientId);
    public ResponseDto getRatingByNameByClient(String ratingName, Long clientId);
    public ResponseDto getRatingByName(String cityName);
    public ResponseDto getRatingByCustomerId(Long customerId);
}
