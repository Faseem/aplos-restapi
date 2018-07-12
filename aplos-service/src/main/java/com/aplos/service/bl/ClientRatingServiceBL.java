package com.aplos.service.bl;

import com.aplos.common.dto.ClientDto;
import com.aplos.common.dto.ClientRatingDto;
import com.aplos.common.dto.RatingDto;
import com.aplos.common.dto.UserDto;
import com.aplos.dao.ClientRatingDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Service
public class ClientRatingServiceBL  {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientRatingServiceBL.class);

    @Autowired
    ClientRatingDao clientRatingDao;

    public ClientRatingDto addClientRating(ClientRatingDto clientRatingDto){
        LOGGER.info("ClientRatingServiceBL.addClientRating(clientRatingDto) execution started.");
        return clientRatingDao.addClientRating(clientRatingDto);
    }

    public List<ClientRatingDto> getAllRatingByClientId(Long clientId){
        LOGGER.info("ClientRatingServiceBL.getAllRatingByClientId(clientId) execution started.");
        return clientRatingDao.getAllRatingByClientId(clientId);
    }

    public List<ClientRatingDto>addAutoGeneratedValues(Long clientId, Long userId, String baseOf){
        LOGGER.info("ClientRatingServiceBL.addAutoGeneratedValues(clientId) execution started.");
        if("5based".equals(baseOf)){
            return this.clientRatingDao.addClientRatingList(this.generateRatingsForClient(1, 5, clientId, userId));
        }else if("3based".equals(baseOf)){
            return this.clientRatingDao.addClientRatingList(this.generateRatingsForClient(6, 8, clientId, userId));
        }else{
            return null;
        }
    }

    private List<ClientRatingDto> generateRatingsForClient(int startIndexOfRating, int endIndexOfRating, Long clientId, Long userId){
        ClientRatingDto clientRatingDto;
        RatingDto ratingDto;
        UserDto createdUser;
        ClientDto clientDto;
        List<ClientRatingDto> clientRatingDtos = new ArrayList<ClientRatingDto>();

        for(int i=startIndexOfRating; i<endIndexOfRating+1; i++){
            clientRatingDto = new ClientRatingDto();
            ratingDto = new RatingDto();
            ratingDto.setRatingId((long) i);
            clientRatingDto.setRatingId(ratingDto);
            createdUser = new UserDto();
            createdUser.setUserId(userId);
            clientRatingDto.setAddedUserId(createdUser);
            clientDto = new ClientDto();
            clientDto.setClientId(clientId);
            clientRatingDto.setClientId(clientDto);
            clientRatingDto.setAddedDate(new Date());
            clientRatingDtos.add(clientRatingDto);
        }

        return clientRatingDtos;
    }
}