package com.pedrohubner.creational.factorymethod;

import com.pedrohubner.creational.factorymethod.bankaccount.BankAccount;
import com.pedrohubner.creational.factorymethod.factory.ConcreteBankFactory;
import com.pedrohubner.creational.factorymethod.model.BankAccountRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/bank")
public class BankAccountController {
    private final ConcreteBankFactory factory;

    @PostMapping
    public BankAccount createBankAccount(@RequestBody BankAccountRequest accountRequest) {
        return factory.createBankAccount(accountRequest);
    }
}
