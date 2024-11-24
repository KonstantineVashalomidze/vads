package org.example.util.logger.output.stream;

import org.example.util.logger.model.Log;

/**
 * @author Konstantine Vashalomidze
 * Implement this interface if you want to add other log output destination.
 */
@FunctionalInterface
public interface LoggerOutputStream {
    void print(Log log, long elapsedTimeMillis);
}
