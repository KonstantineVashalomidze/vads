package org.example.util.logger.output.stream;

import org.example.util.logger.model.Log;

public class DefaultLoggerOutputStream
    implements LoggerOutputStream
{
    @Override
    public void print(Log log, long elapsedTimeMillis) {
        System.out.println("[" + log.getSeverity() + "] " + "{"+ log.getSource() +"} " + log.getMessage() + " (" + elapsedTimeMillis + "ms)");
    }
}
