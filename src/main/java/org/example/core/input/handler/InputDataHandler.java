package org.example.core.input.handler;

import org.example.core.input.model.InputData;
import org.example.core.input.model.InputFormat;
import org.example.core.input.process.InputDataProcessor;
import org.example.core.input.process.InputStringProcessor;
import org.example.core.output.handler.OutputDataHandler;
import org.example.util.logger.model.Log;
import org.example.util.logger.Logger;
import org.example.util.logger.model.Severity;
import org.example.util.logger.output.stream.DefaultLoggerOutputStream;

public class InputDataHandler
{
    private InputDataProcessor inputDataProcessor;
    private Logger logger;

    private OutputDataHandler outputDataHandler;

    public InputDataHandler()
    {
        logger = new Logger(new DefaultLoggerOutputStream());
    }


    private void chooseDataProcessingStrategy(InputFormat format) throws NoSuchMethodException {
        switch (format) {
            case TEXT_FILE -> {
                // Text processor initialisation
            }
            // ...
            // ...
            default -> {
                logger.startTimer();
                inputDataProcessor = new InputStringProcessor();
                logger.endTimer();
                logger.push(new Log(Severity.WARNING, "inputDataProcessor is not set manually, StringProcessor is created automatically", InputDataHandler.class.getDeclaredMethod("chooseDataProcessingStrategy", InputFormat.class).toString()));
            }

        }

    }

    private void processData(InputData inputData) throws NoSuchMethodException {
        logger.startTimer();
        byte[] processed = inputDataProcessor.process(inputData);
        logger.endTimer();
        logger.push(new Log(Severity.INFO, "processed inputData", InputDataHandler.class.getDeclaredMethod("processData", InputData.class).toString()));

        // create output handler
        outputDataHandler = new OutputDataHandler(processed);




    }


    public void handleData(InputData inputData) throws NoSuchMethodException {
        chooseDataProcessingStrategy(inputData.getFormat());
        // once strategy is selected, process specified inputData
        processData(inputData);
    }


}
