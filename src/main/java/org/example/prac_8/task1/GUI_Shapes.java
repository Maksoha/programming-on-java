package org.example.prac_8.task1;

import java.awt.*;
import java.util.*;
import javax.swing.*;
class GUI_Shapes extends JFrame {
    GUI_Shapes() {
        super("Shapes");
        setSize(1200,500);
        JPanel jp = new JPanel() {

            @Override
            public void paint(Graphics g) {
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(0,1000);
                    int y = random.nextInt(0,300);
                    int w = random.nextInt(10,500);
                    int h = random.nextInt(10,200);
                    int s = random.nextInt(0,3);
                    switch (s) {
                        case 0 -> {
                            Shape line = new Line(x, y, x + w, y + h, Shape.getrandomColor());
                            g.drawLine(x, y, line.getWidth(), line.getHeight());
                            g.setColor(line.getColor());
                        }
                        case 1 -> {
                            Shape rectangle = new Rectangle(x, y, w, h, Shape.getrandomColor());
                            g.drawRect(x, y, w, h);
                            g.setColor(rectangle.getColor());
                        }
                        case 2 -> {
                            Shape oval = new Oval(x, y, w, h, Shape.getrandomColor());
                            g.drawOval(x, y, w, h);
                            g.setColor(oval.getColor());
                        }
                    }
                }
            }
        };
        setLocationRelativeTo(null);
        add(jp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI_Shapes();
    }
}
