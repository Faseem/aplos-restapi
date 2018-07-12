package com.aplos.service.impl;

import com.aplos.common.dto.CustomerRatingDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.service.CustomerRatingService;
import com.aplos.service.bl.CustomerRatingServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 17/05/2018.
 */
@Service
public class CustomerRatingServiceImpl implements CustomerRatingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRatingServiceImpl.class);

    @Autowired
    CustomerRatingServiceBL customerRatingServiceBL;

    @Autowired
    ServiceUtil serviceUtil;

    public ResponseDto addCustomerRating(CustomerRatingDto customerRatingDto) {
        LOGGER.info("CustomerRatingServiceImpl.addCustomerRating(customerRatingDto) execution started.");
        ResponseDto responseDto = null;
        try {
            CustomerRatingDto customerRatingDtoResult = customerRatingServiceBL.addCustomerRating(customerRatingDto);
            if (customerRatingDtoResult != null) {
                LOGGER.info("Customer Rating Saved For saved for customerId [{}]", customerRatingDtoResult.getCustomerId().getCustomerId());
                responseDto = serviceUtil.getServiceResponse(customerRatingDtoResult);
            } else {
                LOGGER.info("Unable to Save Customer Rating");
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_SAVE_CUSTOMER_RATING);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while Saving Customer Rating");
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_SAVE_CUSTOMER_RATING);
        }
        return responseDto;
    }
}
