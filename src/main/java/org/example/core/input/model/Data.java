package org.example.core.input.model;

public abstract class Data {
    private String location;
    private String format;

    public Data(String location, String format) {
        this.location = location;
        this.format = format;
    }

    public String getLocation() {
        return location;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Data{" +
                "location='" + location + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
