package com.pedrohubner.structural.adapter;

import com.pedrohubner.structural.adapter.datatype.Json;
import com.pedrohubner.structural.adapter.datatype.Xml;
import lombok.AllArgsConstructor;

import java.beans.XMLDecoder;
import java.util.logging.XMLFormatter;

@AllArgsConstructor
public class JsonToXmlAdapter implements DataAdapter {
    private final Json json;

    @Override
    public Xml convert(Json json) {
        //implement logic
        return null;
    }
}
