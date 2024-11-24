package org.example.util.logger;

import org.example.util.logger.handler.LoggerOutputStreamHandler;
import org.example.util.logger.model.Log;
import org.example.util.logger.output.stream.LoggerOutputStream;

public class Logger
{
    private final LoggerOutputStreamHandler loggerOutputStreamHandler = new LoggerOutputStreamHandler();


    private long startTime;
    private long endTime;

    public Logger(LoggerOutputStream loggerOutputStream)
    {
        loggerOutputStreamHandler.setLoggerOutputStream(loggerOutputStream);
    }

    /* Call before the method to measure time it took */
    public void startTimer()
    {
        startTime = System.currentTimeMillis();
    }

    /* Call after the method to measure time it took */
    public void endTimer()
    {
        endTime = System.currentTimeMillis();
    }

    /* Timer should be started and ended before starting calling this method, otherwise you get 0 ms. in log */
    public void rise(Log log)
    {
        loggerOutputStreamHandler.handleLoggerOutput(log, (endTime - startTime));
        startTime = 0;
        endTime = 0;
    }




}
