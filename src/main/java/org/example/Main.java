package org.example;

import org.example.core.input.handler.InputDataHandler;
import org.example.core.input.model.InputData;
import org.example.core.input.model.InputFormat;
import org.example.core.output.model.OutputData;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        InputDataHandler inputDataHandler = new InputDataHandler();
        String location = "C://";
        InputFormat format = InputFormat.STRING;
        InputData data = new InputData(location, format);
        inputDataHandler.handleData(data);



    }
}
