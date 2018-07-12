package com.aplos.controller;

import com.aplos.common.dto.RatingDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.service.RatingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aux072 on 08/05/2018.
 */
@RestController
@RequestMapping("/ratings")
public class RatingController {
    private final static Logger LOGGER = LoggerFactory.getLogger(RatingController.class);

    @Autowired
    RatingService ratingService;


    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseDto addRating(@RequestBody RatingDto ratingDto) {
        LOGGER.info(
                "RatingController.addRating() invoked.");
        return ratingService.addRating(ratingDto);
    }


    @RequestMapping(value = "/getAllRatings", method = RequestMethod.GET)
    public ResponseDto getAllRatings() {
        LOGGER.info(
                "RatingController.getAllRatings() invoked.");
        return ratingService.getAllRatings();
    }

    @RequestMapping(value = "/getAllRatingByClientId", method = RequestMethod.GET)
    public ResponseDto getAllRatingByClientId(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "RatingController.getAllRatingByClientId(Long {} ) invoked.",clientId);
        return ratingService.getAllRatingByClientId(clientId);
    }

    @RequestMapping(value = "/getRatingByNameByClient", method = RequestMethod.GET)
    public ResponseDto getRatingByNameByClient(@RequestParam("rating_name") String ratingName,
                                             @RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "RatingController.getCityByNameByClient(String {}, Long {} ) invoked.",ratingName, clientId);
        return ratingService.getRatingByNameByClient(ratingName, clientId);
    }

    @RequestMapping(value = "/getRatingByName", method = RequestMethod.GET)
    public ResponseDto getRatingByName(@RequestParam("rating_name") String ratingName) {
        LOGGER.info(
                "RatingController.getRatingByName(String {} ) invoked.",ratingName);
        return ratingService.getRatingByName(ratingName);
    }

    @RequestMapping(value = "/getRatingByCustomerId", method = RequestMethod.GET)
    public ResponseDto getRatingByCustomerId(@RequestParam("customer_id") Long customerId) {
        LOGGER.info(
                "RatingController.getRatingByCustomerId(Long {} ) invoked.",customerId);
        return ratingService.getRatingByCustomerId(customerId);
    }
}
