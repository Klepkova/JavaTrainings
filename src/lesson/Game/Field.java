package lesson.Game;

import java.awt.*;

public class Field {
    private int width;
    private int height;
    public Color color;

    public Field(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
