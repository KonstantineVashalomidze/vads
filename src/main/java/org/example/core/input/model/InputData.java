package org.example.core.input.model;

public abstract class InputData {
    private String location;
    private InputFormat inputFormat;

    public InputData(String location, InputFormat inputFormat) {
        this.location = location;
        this.inputFormat = inputFormat;
    }

    public String getLocation() {
        return location;
    }

    public InputFormat getFormat() {
        return inputFormat;
    }


    @Override
    public String toString() {
        return "Data{" +
                "location='" + location + '\'' +
                ", inputFormat='" + inputFormat + '\'' +
                '}';
    }
}
