package PractWork_8.task1;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Main extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Shape[] shapes;

    public Main() {
        shapes = new Shape[20];
        Random random = new Random();
        for (int i = 0; i < shapes.length; i++)
        {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int size = random.nextInt(50) + 10;
            if (i % 2 == 0)
                shapes[i] = new Circle(x, y, size);
            else
                shapes[i] = new Square(x, y, size);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);

        Main main = new Main();
        frame.add(main);

        frame.setVisible(true);
    }
}