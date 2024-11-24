package org.example.util.logger.handler;

import org.example.util.logger.output.stream.DefaultLoggerOutputStream;
import org.example.util.logger.model.Log;
import org.example.util.logger.output.stream.LoggerOutputStream;

/**
 * @author Konstantine Vashalomidze
 * Handler class responsible for managing logger output stream. Call it's set logger output stream method
 * to change default log output destination.
 */
public class LoggerOutputStreamHandler
{
    private LoggerOutputStream loggerOutputStream;

    public void handleLoggerOutput(Log log, long elapsedTimeMilliseconds)
    {
        // No default output stream strategy is set by hand
        if (loggerOutputStream == null)
        {
            loggerOutputStream = new DefaultLoggerOutputStream();
        }
        loggerOutputStream.print(log, elapsedTimeMilliseconds);
    }

    /* Configure where do you want to print logs */
    public void setLoggerOutputStream(LoggerOutputStream loggerOutputStream) {
        this.loggerOutputStream = loggerOutputStream;
    }
}
