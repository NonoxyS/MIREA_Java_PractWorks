package PractWork_8.task1;

import java.awt.*;

class Square extends Shape {
    private int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x - side / 2, y - side / 2, side, side);
    }
}