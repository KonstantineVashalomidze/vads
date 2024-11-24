package org.example.core.output.handler;

import org.example.core.output.model.OutputData;

public class OutputDataHandler
{
    private long bytes;
    private byte[] processedData;



    public void handleData(byte[] processedData)
    {
        this.processedData = processedData;
        this.bytes = processedData.length * 2L; // uses 2 * length bits
    }






}
