package com.pedrohubner.structural.adapter;

import com.pedrohubner.structural.adapter.datatype.Json;
import com.pedrohubner.structural.adapter.datatype.Xml;

public interface DataAdapter {
    Xml convert(Json json);
}
