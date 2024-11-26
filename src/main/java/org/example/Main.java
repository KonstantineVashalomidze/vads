package org.example;

import org.example.core.input.handler.InputDataHandler;
import org.example.core.output.process.DefaultOutputHdVideoProcessor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {



        DefaultOutputHdVideoProcessor defaultOutputHdVideoProcessor = new DefaultOutputHdVideoProcessor();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        sb.append(String.valueOf(random.ints(50, 70)).repeat(1_000_000));
        defaultOutputHdVideoProcessor.process(sb.toString().getBytes());

    }
}
