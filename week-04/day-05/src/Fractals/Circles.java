package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
    public static void mainDraw(Graphics graphics) {
        graphics.drawOval(0, 0, WIDTH, WIDTH);
        drawCircleFractal(graphics, 0, 0, WIDTH / 2, 7);
    }

    public static void drawCircleFractal(Graphics g, int x0, int y0, int diameter, int counter) {
        if (counter == 0) {
            return;
        } else {
            g.drawOval(x0 + diameter/2, y0, diameter, diameter);
            drawCircleFractal(g, x0 + diameter / 2, y0, diameter / 2, counter - 1);
            g.drawOval((int) (x0 + (1 - Math.cos(Math.toRadians(30))) * diameter / 2), (int) (y0 + (1 + Math.sin(Math.toRadians(30))) * diameter / 2), diameter, diameter);
            drawCircleFractal(g, (int) (x0 + (1 - Math.cos(Math.toRadians(30))) * diameter / 2), (int) (y0 + (1 + Math.sin(Math.toRadians(30))) * diameter / 2), diameter / 2, counter - 1);
            g.drawOval((int) (x0 + (1 + Math.cos(Math.toRadians(30))) * diameter / 2), (int) (y0 + (1 + Math.sin(Math.toRadians(30))) * diameter / 2), diameter, diameter);
            drawCircleFractal(g, (int) (x0 + (1 + Math.cos(Math.toRadians(30))) * diameter / 2), (int) (y0 + (1 + Math.sin(Math.toRadians(30))) * diameter / 2), diameter / 2, counter - 1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 1600;
    static int HEIGHT = 1600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
