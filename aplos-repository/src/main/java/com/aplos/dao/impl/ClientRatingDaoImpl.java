package com.aplos.dao.impl;

import com.aplos.common.dto.ClientRatingDto;
import com.aplos.dao.ClientRatingDao;
import com.aplos.domain.ClientRating;
import com.aplos.transformer.ClientRatingTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 15/05/2018.
 */
@Repository
public class ClientRatingDaoImpl extends BaseDaoImpl<ClientRating>  implements ClientRatingDao {

    @Autowired
    ClientRatingTransformer clientRatingTransformer;

    @Override
    @Transactional
    public ClientRatingDto addClientRating(ClientRatingDto clientRatingDto) {
        ClientRating clientRating = clientRatingTransformer.reverseTransform(clientRatingDto);
        ClientRating clientRatingResult = saveOrUpdate(clientRating);
        ClientRatingDto clientRatingDtoResult = clientRatingTransformer.transform(clientRatingResult);
        return clientRatingDtoResult;
    }

    @Override
    public List<ClientRatingDto> getAllRatingByClientId(Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(ClientRating.class);
        criteria.add(Restrictions.eq("clientId", clientId));
        List<ClientRatingDto> clientRatingDtos = new ArrayList<>();
        for (ClientRating clientRating : (ArrayList<ClientRating>)criteria.list()) {
            clientRatingDtos.add(clientRatingTransformer.transform(clientRating));
        }
        return  clientRatingDtos;
    }

    @Override
    @Transactional
    public List<ClientRatingDto> addClientRatingList(List<ClientRatingDto> clientRatingDtos) {
        List<ClientRatingDto> clientRatingDtosResult = new ArrayList<>();
        for (ClientRatingDto clientRatingDto : clientRatingDtos) {
            ClientRating clientRating = saveOrUpdate(clientRatingTransformer.reverseTransform(clientRatingDto));
            clientRatingDtosResult.add(clientRatingTransformer.transform(clientRating));
        }
        return clientRatingDtosResult;
    }
}
