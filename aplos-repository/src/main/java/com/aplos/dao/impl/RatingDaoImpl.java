package com.aplos.dao.impl;

import com.aplos.common.dto.RatingDto;
import com.aplos.dao.RatingDao;
import com.aplos.domain.ClientRating;
import com.aplos.domain.CustomerRating;
import com.aplos.domain.Rating;
import com.aplos.transformer.RatingTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Repository
public class RatingDaoImpl  extends BaseDaoImpl<Rating> implements RatingDao {

    @Autowired
    RatingTransformer ratingTransformer;

    @Override
    public RatingDto addRating(RatingDto ratingDto) {
        Rating ratingResult = saveOrUpdate(ratingTransformer.reverseTransform(ratingDto));
        return ratingTransformer.transform(ratingResult);
    }

    @Override
    public List<RatingDto> getAllRatings() {
        Criteria criteria = getCurrentSession().createCriteria(Rating.class);
        List<RatingDto> ratingDtos = new ArrayList<>();
        for (Rating rating : (ArrayList<Rating>)criteria.list()) {
            ratingDtos.add(ratingTransformer.transform(rating));
        }
        return  ratingDtos;
    }

    @Override
    public List<RatingDto> getAllRatingByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientRating.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        List<RatingDto> ratingDtos = new ArrayList<>();
        for (ClientRating clientRating : (ArrayList<ClientRating>)criteria.list()) {
            ratingDtos.add(ratingTransformer.transform(clientRating.getRatingId()));
        }
        return  ratingDtos;
    }

    @Override
    public RatingDto getRatingByNameByClient(String ratingName, Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientRating.class);
        criteria.createAlias("clientId", "clientId");
        criteria.add(Restrictions.eq("clientId.clientId", clientId));
        criteria.createAlias("ratingId", "ratingId");
        criteria.add(Restrictions.eq("ratingId.ratingName", ratingName));
        return ratingTransformer.transform(((ClientRating) criteria.uniqueResult()).getRatingId());
    }

    @Override
    public RatingDto getRatingByName(String ratingName) {
        Criteria criteria = getCurrentSession().createCriteria(Rating.class);
        criteria.add(Restrictions.eq("ratingName", ratingName));
        return ratingTransformer.transform((Rating) criteria.uniqueResult());
    }

    @Override
    public RatingDto getRatingByCustomerId(Long customerId) {
        Criteria criteria = getCurrentSession().createCriteria(CustomerRating.class);
        criteria.createAlias("customerId", "customerId");
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        return ratingTransformer.transform(((CustomerRating) criteria.uniqueResult()).getRatingId());
    }
}
