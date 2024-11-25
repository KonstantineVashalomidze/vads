package org.example.core.output.handler;


import org.example.core.output.model.Resolution;

public class OutputDataHandler
{
    private long bytes;
    private byte[] processedData;

    private Resolution resolution;
    private int delayBetweenFrameUpdate;


    public void handleData(byte[] processedData, Resolution resolution, int delayBetweenFrameUpdate)
    {
        initialise(processedData, resolution, delayBetweenFrameUpdate);




    }

    private void initialise(byte[] processedData, Resolution resolution, int delayBetweenFrameUpdate)
    {
        this.processedData = processedData;
        bytes = processedData.length * 2L; // uses 2 * length bits
        this.resolution = resolution;
        this.delayBetweenFrameUpdate = delayBetweenFrameUpdate;
    }










}
