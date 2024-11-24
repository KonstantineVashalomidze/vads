package org.example.core.input.handler;

import org.example.core.input.model.Data;
import org.example.core.input.process.DataProcessor;
import org.example.core.input.process.StringProcessor;
import org.example.util.logger.model.Log;
import org.example.util.logger.Logger;
import org.example.util.logger.model.Severity;

public class DataHandler
{
    private DataProcessor dataProcessor;
    private Logger logger;

    public DataHandler()
    {
        logger = new Logger(this);
    }

    public void handleData(Data data)
    {
        if (dataProcessor == null)
        {
            logger.rise(new Log(Severity.WARNING, "handleData(): "));
            dataProcessor = new StringProcessor();
        }
        logger.startTime();
        dataProcessor.process(data);
        logger.rise(new Log(Severity.INFO, "handleData(): " + data.toString() + logger.endTime()));

    }

    public void setDataProcessor(DataProcessor dataProcessor) {

        this.dataProcessor = dataProcessor;
    }
}
