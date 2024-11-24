package org.example.core.output.model;

public class OutputData {
    private String location;
    private OutputFormat outputFormat;

    public OutputData(String location, OutputFormat outputFormat) {
        this.location = location;
        this.outputFormat = outputFormat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }

    @Override
    public String toString() {
        return "OutputData{" +
                "location='" + location + '\'' +
                ", outputFormat=" + outputFormat +
                '}';
    }
}
