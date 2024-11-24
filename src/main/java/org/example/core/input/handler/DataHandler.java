package org.example.core.input.handler;

import org.example.core.input.model.Data;
import org.example.core.input.process.DataProcessor;
import org.example.core.input.process.StringProcessor;
import org.example.util.logger.model.Log;
import org.example.util.logger.Logger;
import org.example.util.logger.model.Severity;
import org.example.util.logger.output.stream.DefaultLoggerOutputStream;

public class DataHandler
{
    private DataProcessor dataProcessor;
    private Logger logger;

    public DataHandler()
    {
        logger = new Logger(new DefaultLoggerOutputStream());
    }

    public void handleData(Data data) throws NoSuchMethodException {
        if (dataProcessor == null)
        {
            logger.startTimer();
            dataProcessor = new StringProcessor();
            logger.endTimer();
            logger.rise(new Log(Severity.WARNING, "dataProcessor is not set manually, StringProcessor is created automatically", DataHandler.class.getMethod("handleData", Data.class).toString()));
        }
        logger.startTimer();
        dataProcessor.process(data);
        logger.endTimer();
        logger.rise(new Log(Severity.INFO, "processed data", DataHandler.class.getMethod("handleData", Data.class).toString()));

    }

    public void setDataProcessor(DataProcessor dataProcessor) {

        this.dataProcessor = dataProcessor;
    }
}
