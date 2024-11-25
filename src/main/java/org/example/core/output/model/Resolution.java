package org.example.core.output.model;

public enum Resolution {
    HD_720P(1280, 720),
    FULL_HD_1080P(1920, 1080);
    private final int width;
    private final int height;

    Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

}












