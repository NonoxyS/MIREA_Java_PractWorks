package PractWork_8.task2;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private Image image;

    public Main(String imagePath) {
        loadImage(imagePath);
    }

    private void loadImage(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        image = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        String imagePath = args[0];
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Picture");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);

            Main main = new Main(imagePath);
            frame.add(main);

            frame.setVisible(true);
        });
    }
}