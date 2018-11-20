package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet {
    public static void mainDraw(Graphics graphics) {
        drawSquare(graphics, WIDTH / 3, WIDTH / 3, WIDTH / 3);
        drawSierpinski(graphics, WIDTH / 3, WIDTH / 3, WIDTH / 9, 7);
    }

    public static void drawSierpinski(Graphics g, int x0, int y0, int sideLength, int counter) {
        if (counter == 0) {
            return;
        } else {
            drawSquare(g, x0 - 2 * sideLength, y0 - 2 * sideLength, sideLength);
            drawSierpinski(g, x0 - 2 * sideLength, y0 - 2 * sideLength, sideLength / 3, counter - 1);
            drawSquare(g, x0 + sideLength, y0 - 2 * sideLength, sideLength);
            drawSierpinski(g, x0 + sideLength, y0 - 2 * sideLength, sideLength / 3, counter - 1);
            drawSquare(g, x0 + 4 * sideLength, y0 - 2 * sideLength, sideLength);
            drawSierpinski(g, x0 + 4 * sideLength, y0 - 2 * sideLength, sideLength / 3, counter - 1);
            drawSquare(g, x0 - 2 * sideLength, y0 + sideLength, sideLength);
            drawSierpinski(g, x0 - 2 * sideLength, y0 + sideLength, sideLength / 3, counter - 1);
            drawSquare(g, x0 + 4 * sideLength, y0 + sideLength, sideLength);
            drawSierpinski(g, x0 + 4 * sideLength, y0 + sideLength, sideLength / 3, counter - 1);
            drawSquare(g, x0 - 2 * sideLength, y0 + 4 * sideLength, sideLength);
            drawSierpinski(g, x0 - 2 * sideLength, y0 + 4 * sideLength, sideLength / 3, counter - 1);
            drawSquare(g, x0 + sideLength, y0 + 4 * sideLength, sideLength);
            drawSierpinski(g, x0 + sideLength, y0 + 4 * sideLength, sideLength / 3, counter - 1);
            drawSquare(g, x0 + 4 * sideLength, y0 + 4 * sideLength, sideLength);
            drawSierpinski(g, x0 + 4 * sideLength, y0 + 4 * sideLength, sideLength / 3, counter - 1);
        }
    }

    public static void drawSquare(Graphics g, int x0, int y0, int sidelength) {
        g.setColor(Color.BLACK);
        g.fillRect(x0, y0, sidelength, sidelength);
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
