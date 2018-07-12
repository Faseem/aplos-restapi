package com.aplos.transformer;

import com.aplos.common.dto.ClientRatingDto;
import com.aplos.domain.ClientRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Service
public class ClientRatingTransformer implements BaseTransformer<ClientRating, ClientRatingDto> {

    @Autowired
    RatingTransformer ratingTransformer;

    @Autowired
    ClientTrasformenr clientTrasformenr;

    @Autowired
    UserTransformer userTransformer;

    @Override
    public ClientRatingDto transform(ClientRating clientRating) {
        ClientRatingDto clientRatingDto = new ClientRatingDto();
        clientRatingDto.setClientRatingId(clientRating.getClientRatingId());
        clientRatingDto.setAddedDate(clientRating.getAddedDate());
        clientRatingDto.setAddedUserId(userTransformer.transform(clientRating.getAddedUserId()));
        clientRatingDto.setClientId(clientTrasformenr.transform(clientRating.getClientId()));
        clientRatingDto.setRatingId(ratingTransformer.transform(clientRating.getRatingId()));
        return clientRatingDto;
    }

    @Override
    public ClientRating reverseTransform(ClientRatingDto clientRatingDto) {
        ClientRating clientRating = new ClientRating();
        clientRating.setClientRatingId(clientRatingDto.getClientRatingId());
        clientRating.setAddedDate(clientRatingDto.getAddedDate());
        clientRating.setAddedUserId(userTransformer.reverseTransform(clientRatingDto.getAddedUserId()));
        clientRating.setClientId(clientTrasformenr.reverseTransform(clientRatingDto.getClientId()));
        clientRating.setRatingId(ratingTransformer.reverseTransform(clientRatingDto.getRatingId()));
        return clientRating;
    }
}
