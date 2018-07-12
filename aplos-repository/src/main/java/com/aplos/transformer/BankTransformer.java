package com.aplos.transformer;

import com.aplos.common.dto.BankDto;
import com.aplos.domain.Bank;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 11/06/2018.
 */
@Service
public class BankTransformer implements BaseTransformer<Bank, BankDto> {
    @Override
    public BankDto transform(Bank bank) {
        BankDto bankDto = new BankDto();
        bankDto.setBankId(bank.getBankId());
        bankDto.setBankDescription(bank.getBankDescription());
        bankDto.setBankName(bank.getBankName());
        return bankDto;
    }

    @Override
    public Bank reverseTransform(BankDto bankDto) {
        Bank bank = new Bank();
        bank.setBankId(bankDto.getBankId());
        bank.setBankDescription(bankDto.getBankDescription());
        bank.setBankName(bankDto.getBankName());
        return bank;
    }
}
