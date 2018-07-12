package com.aplos.dao;

import com.aplos.common.dto.ClientRatingDto;

import java.util.List;

/**
 * Created by Aux072 on 15/05/2018.
 */
public interface ClientRatingDao {
    public ClientRatingDto addClientRating(ClientRatingDto clientRatingDto);
    public List<ClientRatingDto> getAllRatingByClientId(Long clientId);
    public List<ClientRatingDto> addClientRatingList(List<ClientRatingDto> clientRatingDtos);
}
