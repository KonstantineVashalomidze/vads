package org.example.core.input.process;

import org.example.core.input.model.Data;

public interface DataProcessor {
    byte[] process(Data data);
}
