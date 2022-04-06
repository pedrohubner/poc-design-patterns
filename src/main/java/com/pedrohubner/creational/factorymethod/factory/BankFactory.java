package com.pedrohubner.creational.factorymethod.factory;

import com.pedrohubner.creational.factorymethod.bankaccount.BankAccount;
import com.pedrohubner.creational.factorymethod.model.BankAccountRequest;
import org.springframework.stereotype.Component;

@Component
public interface BankFactory {
    BankAccount createBankAccount(BankAccountRequest accountRequest);
}
