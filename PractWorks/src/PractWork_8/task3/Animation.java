package PractWork_8.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Animation extends JPanel implements ActionListener {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    private BufferedImage[] frames;
    private int currentFrameIndex;
    private Timer timer;

    public Animation() {
        frames = new BufferedImage[65];

        // Загрузка кадров изображения
        for (int i = 0; i < frames.length; i++) {
            String imagePath = "gifka/gif(" + i + 1 + ").jpg";
            frames[i] = loadImage(imagePath);
        }

        currentFrameIndex = 0;

        timer = new Timer(200, this);
        timer.start();
    }

    private BufferedImage loadImage(String imagePath) {
        BufferedImage image = null;
        try
        {
            image = ImageIO.read(new File(imagePath));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames[currentFrameIndex] != null) {
            g.drawImage(frames[currentFrameIndex], 0, 0, WIDTH, HEIGHT, null);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrameIndex++;
        if (currentFrameIndex >= frames.length) {
            currentFrameIndex = 0;
        }
        repaint();
    }
}