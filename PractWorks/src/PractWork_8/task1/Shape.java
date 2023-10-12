package PractWork_8.task1;

import java.awt.*;
import java.util.Random;

abstract class Shape {
    Color color;
    int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;

        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        this.color = new Color(r, g, b);
    }

    public abstract void draw(Graphics g);
}