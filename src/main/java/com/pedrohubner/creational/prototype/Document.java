package com.pedrohubner.creational.prototype;

import com.pedrohubner.commons.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Document {
    private DocumentTypeEnum typeEnum;
    private String name;

    abstract Document copy();
}
