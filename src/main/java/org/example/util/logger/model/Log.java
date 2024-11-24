package org.example.util.logger.model;

public class Log {

    private Severity severity;
    private String message;

    private String source;

    public Log(Severity severity, String message, String source) {
        this.severity = severity;
        this.message = message;
        this.source = source;
    }



    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "Log{" +
                "severity=" + severity +
                ", message='" + message + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
