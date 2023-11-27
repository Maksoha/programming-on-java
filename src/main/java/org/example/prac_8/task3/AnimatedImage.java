package org.example.prac_8.task3;

import org.example.prac_8.task2.GUI_Image;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedImage extends JFrame {
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    public AnimatedImage(String imagePath) {
        setTitle("Image Display");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        JPanel panel = new JPanel();
        panel.add(imageLabel);

        add(panel);
    }

    public static void main(String[] args) {
        GUI_Image display = new GUI_Image("/Users/maksimkrestin/IdeaProjects/java/src/main/java/org/example/prac_8/task3/2.gif");
        display.setVisible(true);
    }

}
