package PractWork_8.task3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GIF");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(Animation.WIDTH, Animation.HEIGHT);
            frame.setLocationRelativeTo(null);

            Animation animation = new Animation();
            frame.add(animation);

            frame.setVisible(true);
        });
    }
}
