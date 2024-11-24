package org.example;

import org.example.core.input.handler.InputDataHandler;
import org.example.core.input.model.InputData;
import org.example.core.input.model.InputFormat;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        InputDataHandler inputDataHandler = new InputDataHandler();
        String location = "C://";
        InputFormat format = InputFormat.STRING;
        InputData data = new InputData(location, format) {
            @Override
            public String getLocation() {
                return super.getLocation();
            }

            @Override
            public InputFormat getFormat() {
                return super.getFormat();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };

        inputDataHandler.handleData(data);

    }
}
