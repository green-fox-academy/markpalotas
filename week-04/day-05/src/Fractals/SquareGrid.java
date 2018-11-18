package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics) {
        squareBorder(graphics, WIDTH / 4, WIDTH / 4, WIDTH / 2, 60);
        drawSqGridFractal(graphics, WIDTH / 4, WIDTH / 4, WIDTH / 4, 30, 7);
    }

    public static void drawSqGridFractal(Graphics g, int x0, int y0, int sideLength, int border, int counter) {
        if (counter == 0) {
            return;
        } else {
            squareBorder(g, x0 - sideLength / 2, y0 - sideLength / 2, sideLength, border);
            drawSqGridFractal(g, x0 - sideLength / 2, y0 - sideLength / 2, sideLength / 2, border / 2, counter - 1);
            squareBorder(g, x0 + 3 * sideLength / 2, y0 - sideLength / 2, sideLength, border);
            drawSqGridFractal(g, x0 + 3 * sideLength / 2, y0 - sideLength / 2, sideLength / 2, border / 2, counter - 1);
            squareBorder(g, x0 + 3 * sideLength / 2, y0 + 3 * sideLength / 2, sideLength, border);
            drawSqGridFractal(g, x0 + 3 * sideLength / 2, y0 + 3 * sideLength / 2, sideLength / 2, border / 2, counter - 1);
            squareBorder(g, x0 - sideLength / 2, y0 + 3 * sideLength / 2, sideLength, border);
            drawSqGridFractal(g, x0 - sideLength / 2, y0 + 3 * sideLength / 2, sideLength / 2, border / 2, counter - 1);
        }
    }

    public static void squareBorder(Graphics g, int x0, int y0, int sidelength, int border) {
        g.setColor(Color.BLACK);
        g.fillRect(x0, y0, sidelength, border);
        g.fillRect(x0 + sidelength - border, y0, border, sidelength);
        g.fillRect(x0, y0, border, sidelength);
        g.fillRect(x0, y0 + sidelength - border, sidelength, border);
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
