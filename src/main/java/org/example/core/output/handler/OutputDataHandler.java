package org.example.core.output.handler;

public class OutputDataHandler
{
    private long bytes;
    private byte[] processedData;

    public OutputDataHandler(byte[] processedData) {
        this.processedData = processedData;
        this.bytes = processedData.length * 2L; // uses 2 * length bits
    }





}
