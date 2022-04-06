package com.pedrohubner.creational.factorymethod.bankaccount;

import com.pedrohubner.commons.enums.BankAccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    private String id = new Object().toString();
    private BankAccountType type;
    private String name;
    private String document;
}
