package org.example.util.logger.output.stream;

import org.example.util.logger.model.Log;

public interface LoggerOutputStream {
    void print(Log log, long elapsedTimeMillis);
}
