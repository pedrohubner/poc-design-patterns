package com.pedrohubner.creational.factorymethod.bankaccount;

import com.pedrohubner.commons.enums.BankAccountType;
import com.pedrohubner.creational.factorymethod.model.BankAccountRequest;
import org.springframework.stereotype.Service;

@Service
public class IndividualBankAccount implements Bank {
    @Override
    public BankAccount createBankAccount(BankAccountRequest accountRequest) {
        if (!BankAccountType.INDIVIDUAL.equals(accountRequest.getType())) return null;
        return buildIndividualBankAccount(accountRequest);
    }

    private BankAccount buildIndividualBankAccount(BankAccountRequest accountRequest) {
        return BankAccount.builder()
                .name(accountRequest.getName())
                .document(accountRequest.getDocument())
                .type(BankAccountType.INDIVIDUAL)
                .build();
    }
}
