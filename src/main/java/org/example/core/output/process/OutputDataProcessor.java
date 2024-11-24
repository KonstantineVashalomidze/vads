package org.example.core.output.process;

import org.example.core.output.model.OutputData;

public interface OutputDataProcessor {
    OutputData process(byte[] bytes);
}
