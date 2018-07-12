package com.aplos.dao;

import com.aplos.common.dto.RatingDto;
import com.aplos.domain.City;
import com.aplos.domain.Rating;

import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */
public interface RatingDao extends  BaseDao<Rating> {
    public RatingDto addRating(RatingDto ratingDto);
    public List<RatingDto> getAllRatings();
    public List<RatingDto> getAllRatingByClientId(Long clientId);
    public RatingDto getRatingByNameByClient(String ratingName, Long clientId);
    public RatingDto getRatingByName(String ratingName);
    public RatingDto getRatingByCustomerId(Long customerId);
}