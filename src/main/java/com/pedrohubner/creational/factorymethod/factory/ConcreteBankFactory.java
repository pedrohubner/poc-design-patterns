package com.pedrohubner.creational.factorymethod.factory;

import com.pedrohubner.creational.factorymethod.bankaccount.Bank;
import com.pedrohubner.creational.factorymethod.bankaccount.BankAccount;
import com.pedrohubner.creational.factorymethod.model.BankAccountRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConcreteBankFactory implements BankFactory {
    private final Bank bank;

    @Override
    public BankAccount createBankAccount(BankAccountRequest accountRequest) {
        return bank.createBankAccount(accountRequest);
    }
}
