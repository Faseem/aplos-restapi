package com.aplos.service.bl;

import com.aplos.common.dto.RatingDto;
import com.aplos.dao.RatingDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class RatingServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceBL.class);

    @Autowired
    RatingDao ratingDao;


    public List<RatingDto> getAllRatings(){
        LOGGER.info("RatingServiceBL.getAllRatings() execution started.");
        return ratingDao.getAllRatings();
    }

    public List<RatingDto> getAllRatingByClientId(Long clientId){
        LOGGER.info("RatingServiceBL.getAllRatingByClientId(clientId) execution started.");
        return ratingDao.getAllRatingByClientId(clientId);
    }

    public RatingDto getRatingByNameByClient(String ratingName, Long clientId){
        LOGGER.info("RatingServiceBL.getRatingByNameByClient(ratingName, clientId) execution started.");
        return ratingDao.getRatingByNameByClient(ratingName, clientId);
    }

    public RatingDto getRatingByName(String ratingName){
        LOGGER.info("RatingServiceBL.getRatingByName(ratingName) execution started.");
        return ratingDao.getRatingByName(ratingName);
    }

    public RatingDto addRating(RatingDto ratingDto){
        LOGGER.info("RatingServiceBL.addRating(ratingDto) execution started.");
        return ratingDao.addRating(ratingDto);
    }

    public RatingDto getRatingByCustomerId(Long customerId){
        LOGGER.info("RatingServiceBL.getRatingByCustomerId(customerId) execution started.");
        return ratingDao.getRatingByCustomerId(customerId);
    }
}
