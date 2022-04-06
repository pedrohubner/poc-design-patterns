package com.pedrohubner.creational.factorymethod.model;

import com.pedrohubner.commons.enums.BankAccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountRequest {
    private BankAccountType type;
    private String name;
    private String document;
}
