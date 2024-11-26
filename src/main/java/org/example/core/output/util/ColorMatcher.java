package org.example.core.output.util;

import java.awt.Color;

public class ColorMatcher {
    public Color findClosestColor(Color inputColor) {
        Color[] targetColors = {Color.RED, Color.WHITE, Color.GREEN};
        Color closestColor = targetColors[0];
        double minDistance = calculateColorDistance(inputColor, targetColors[0]);

        for (Color targetColor : targetColors) {
            double distance = calculateColorDistance(inputColor, targetColor);
            if (distance < minDistance) {
                minDistance = distance;
                closestColor = targetColor;
            }
        }

        return closestColor;
    }

    private double calculateColorDistance(Color c1, Color c2) {
        // Using Euclidean distance in RGB space
        int rDiff = c1.getRed() - c2.getRed();
        int gDiff = c1.getGreen() - c2.getGreen();
        int bDiff = c1.getBlue() - c2.getBlue();

        return Math.sqrt(rDiff*rDiff + gDiff*gDiff + bDiff*bDiff);
    }
}