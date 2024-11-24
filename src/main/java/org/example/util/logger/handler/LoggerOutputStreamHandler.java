package org.example.util.logger.handler;

import org.example.util.logger.output.stream.DefaultLoggerOutputStream;
import org.example.util.logger.model.Log;
import org.example.util.logger.output.stream.LoggerOutputStream;

public class LoggerOutputStreamHandler
{
    private LoggerOutputStream loggerOutputStream;

    public void handleLoggerOutput(Log log, long elapsedTimeMilliseconds)
    {
        if (loggerOutputStream == null)
        {
            loggerOutputStream = new DefaultLoggerOutputStream();
        }
        loggerOutputStream.print(log, elapsedTimeMilliseconds);
    }

    public void setLoggerOutputStream(LoggerOutputStream loggerOutputStream) {
        this.loggerOutputStream = loggerOutputStream;
    }
}
