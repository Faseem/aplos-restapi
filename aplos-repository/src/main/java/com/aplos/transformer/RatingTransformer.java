package com.aplos.transformer;

import com.aplos.common.dto.RatingDto;
import com.aplos.domain.Rating;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class RatingTransformer implements BaseTransformer<Rating, RatingDto> {
    @Override
    public RatingDto transform(Rating rating) {
        RatingDto ratingDto = new RatingDto();
        ratingDto.setRatingDescription(rating.getRatingDescription());
        ratingDto.setRatingId(rating.getRatingId());
        ratingDto.setRatingName(rating.getRatingName());

        return ratingDto;
    }

    @Override
    public Rating reverseTransform(RatingDto ratingDto) {
        Rating rating = new Rating();
        rating.setRatingDescription(ratingDto.getRatingDescription());
        rating.setRatingId(ratingDto.getRatingId());
        rating.setRatingName(ratingDto.getRatingName());

        return rating;
    }
}
