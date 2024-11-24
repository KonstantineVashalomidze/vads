package org.example.core.input.process;

import org.example.core.input.model.InputData;
import org.example.util.logger.Logger;
import org.example.util.logger.output.stream.DefaultLoggerOutputStream;

import java.util.Scanner;

public class InputStringProcessor
    implements InputDataProcessor
{
    private Logger logger;

    public InputStringProcessor()
    {
        logger = new Logger(new DefaultLoggerOutputStream());
    }

    @Override
    public byte[] process(InputData data) {
        // if it's string processor just read it from terminal
        Scanner scanner = new Scanner(System.in);
        return scanner.next().getBytes();
    }
}
