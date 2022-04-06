package com.pedrohubner.creational.factorymethod.bankaccount;

import com.pedrohubner.creational.factorymethod.model.BankAccountRequest;

public interface Bank {
    BankAccount createBankAccount(BankAccountRequest accountRequest);
}
