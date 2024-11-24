package org.example;

import org.example.core.input.handler.DataHandler;
import org.example.core.input.model.Data;

public class Main {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        String location = "C://";
        String format = ".PNG";
        Data data = new Data(location, format) {
            @Override
            public String getLocation() {
                return super.getLocation();
            }

            @Override
            public String getFormat() {
                return super.getFormat();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };

        dataHandler.handleData(data);

    }
}
