package com.aplos.transformer;

import com.aplos.common.dto.ClientBankDto;
import com.aplos.domain.ClientBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 11/06/2018.
 */
@Service
public class ClientBankTransformer implements BaseTransformer<ClientBank, ClientBankDto>{

    @Autowired
    UserTransformer userTransformer;

    @Autowired
    BankTransformer bankTransformer;

    @Autowired
    ClientTrasformenr clientTrasformenr;


    @Override
    public ClientBankDto transform(ClientBank clientBank) {
        ClientBankDto clientBankDto  = new ClientBankDto();
        clientBankDto.setAddedUserId(userTransformer.transform(clientBank.getAddedUserId()));
        clientBankDto.setAssignedDate(clientBank.getAssignedDate());
        clientBankDto.setClientBankId(clientBank.getClientBankId());
        clientBankDto.setBankId(bankTransformer.transform(clientBank.getBankId()));
        clientBankDto.setClientId(clientTrasformenr.transform(clientBank.getClientId()));
        return clientBankDto;
    }

    @Override
    public ClientBank reverseTransform(ClientBankDto clientBankDto) {
        ClientBank clientBank  = new ClientBank();
        clientBank.setAddedUserId(userTransformer.reverseTransform(clientBankDto.getAddedUserId()));
        clientBank.setAssignedDate(clientBankDto.getAssignedDate());
        clientBank.setClientBankId(clientBankDto.getClientBankId());
        clientBank.setBankId(bankTransformer.reverseTransform(clientBankDto.getBankId()));
        clientBank.setClientId(clientTrasformenr.reverseTransform(clientBankDto.getClientId()));
        return clientBank;
    }
}
