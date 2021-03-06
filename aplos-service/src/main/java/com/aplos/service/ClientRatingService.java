package com.aplos.service;

import com.aplos.common.dto.ClientRatingDto;
import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 15/05/2018.
 */
public interface ClientRatingService {
    public ResponseDto addClientRating(ClientRatingDto clientRatingDto);
    public ResponseDto getAllRatingByClientId(Long clientId);
    public ResponseDto addAutoGeneratedValues(Long clientId, Long userId, String baseOf);
}
