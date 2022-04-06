package com.pedrohubner.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum BankAccountType {
    ENTERPRISE(1), INDIVIDUAL(2);

    private final Integer type;

    public static BankAccountType getAccountType(Integer accountType) {
        return Arrays.stream(values())
                .filter(account -> account.getType().equals(accountType))
                .findFirst()
                .get();
    }
}
