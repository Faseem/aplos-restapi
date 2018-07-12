package com.aplos.service.impl;

import com.aplos.common.dto.RatingDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.RatingService;
import com.aplos.service.bl.RatingServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */

@Service
public class RatingServiceImpl implements RatingService{

    private static final Logger LOGGER = LoggerFactory.getLogger(RatingServiceImpl.class);

    @Autowired
    RatingServiceBL ratingServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addRating(RatingDto ratingDto) {
        LOGGER.info("RatingServiceImpl.addRating(ratingDto) execution started.");
        ResponseDto responseDto = null;
        try {
            RatingDto ratingDtoResult = ratingServiceBL.addRating(ratingDto);
            if (ratingDto != null) {
                LOGGER.info("Rating saved");
                responseDto = serviceUtil.getServiceResponse(ratingDtoResult);
            } else {
                LOGGER.info("Unable to save Ratings");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_RATING);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while save Ratings");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_RATINGS);
        }
        return responseDto;
    }

    public ResponseDto getAllRatings() {
        LOGGER.info("RatingServiceImpl.getAllRatings() execution started.");
        ResponseDto responseDto = null;
        try {
            List<RatingDto> ratingDtos = ratingServiceBL.getAllRatings();
            if (ratingDtos != null) {
                LOGGER.info("Ratings received");
                responseDto = serviceUtil.getServiceResponse(ratingDtos);
            } else {
                LOGGER.info("Unable to receive Ratings");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_RATINGS);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive Ratings");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_RATINGS);
        }
        return responseDto;
    }

    public ResponseDto getAllRatingByClientId(Long clientId) {
        LOGGER.info("RatingServiceImpl.getAllItemByClientId(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<RatingDto> ratingDtos = ratingServiceBL.getAllRatingByClientId(clientId);
            if (ratingDtos != null) {
                LOGGER.info("Ratings received for given clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(ratingDtos);
            } else {
                LOGGER.info("Unable to receive ratings for the given clientId [{}]", clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_RATING_FOR_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive ratingss for the given clientId [{}]", clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_RATING_FOR_CLIENT_ID);
        }
        return responseDto;
    }

    public ResponseDto getRatingByNameByClient(String ratingName, Long clientId) {
        LOGGER.info("RatingServiceImpl.getRatingByNameByClient(cityName , clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            RatingDto ratingDto = ratingServiceBL.getRatingByNameByClient(ratingName, clientId);
            if (ratingDto != null) {
                LOGGER.info("City received for given RatingName [{}] clientId [{}]", ratingName, clientId);
                responseDto = serviceUtil.getServiceResponse(ratingDto);
            } else {
                LOGGER.info("Unable to receive rating for the given ratingName [{}] clientId [{}]", ratingName, clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_RATING_FOR_RATING_NAME_CLIENT_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive items for the given ratingName clientId [{}]", ratingName, clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_RATING_FOR_RATING_NAME_CLIENT_ID);
        }
        return responseDto;
    }

    public ResponseDto getRatingByName(String ratingName) {
        LOGGER.info("RatingServiceImpl.getRatingByName(ratingName) execution started.");
        ResponseDto responseDto = null;
        try {
            RatingDto ratingDto = ratingServiceBL.getRatingByName(ratingName);
            if (ratingDto != null) {
                LOGGER.info("Rating received for given RatingName [{}]", ratingName);
                responseDto = serviceUtil.getServiceResponse(ratingDto);
            } else {
                LOGGER.info("Unable to receive rating for the given ratingName [{}]", ratingName);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_RATING_FOR_RATING_NAME);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive rating for the given ratingName [{}]", ratingName);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_RATING_FOR_RATING_NAME);
        }
        return responseDto;
    }

    public ResponseDto getRatingByCustomerId(Long customerId) {
        LOGGER.info("RatingServiceImpl.getRatingByCustomerId(clientId) execution started.");
        ResponseDto responseDto = null;
        try {
            RatingDto ratingDto = ratingServiceBL.getRatingByCustomerId(customerId);
            if (ratingDto != null) {
                LOGGER.info("Ratings received for given customerId [{}]", customerId);
                responseDto = serviceUtil.getServiceResponse(ratingDto);
            } else {
                LOGGER.info("Unable to receive ratings for the given clientId [{}]", customerId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_RATING_FOR_CUSTOMER_ID);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receive ratingss for the given customerId [{}]", customerId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_RATING_FOR_CUSTOMER_ID);
        }
        return responseDto;
    }
}
