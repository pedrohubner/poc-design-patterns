package com.pedrohubner.creational.factorymethod.bankaccount;

import com.pedrohubner.commons.enums.BankAccountType;
import com.pedrohubner.creational.factorymethod.model.BankAccountRequest;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseBankAccount implements Bank {
    @Override
    public BankAccount createBankAccount(BankAccountRequest accountRequest) {
        if (!BankAccountType.ENTERPRISE.equals(accountRequest.getType())) return null;
        return buildEnterpriseBankAccount(accountRequest);
    }

    private BankAccount buildEnterpriseBankAccount(BankAccountRequest accountRequest) {
        return BankAccount.builder()
                .name(accountRequest.getName())
                .document(accountRequest.getDocument())
                .type(BankAccountType.ENTERPRISE)
                .build();
    }
}
