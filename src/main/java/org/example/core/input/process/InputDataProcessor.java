package org.example.core.input.process;

import org.example.core.input.model.InputData;

public interface InputDataProcessor {
    byte[] process(InputData inputData);
}
