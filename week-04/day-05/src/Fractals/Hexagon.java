package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
    public static void mainDraw(Graphics graphics) {
        drawHexFractal(graphics, WIDTH / 4, 0, WIDTH / 6, 5);
    }

    public static void drawHexagon(Graphics g, int x0, int y0, int sideLength) {
        int nPoints = 6;
        int h = (int) (Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength / 2, 2)));
        int[] xCoord = {x0, x0 + sideLength, x0 + sideLength * 3 / 2, x0 + sideLength, x0, x0 - sideLength / 2};
        int[] yCoord = {y0, y0, y0 + h, y0 + 2 * h, y0 + 2 * h, y0 + h};
        g.drawPolygon(xCoord, yCoord, nPoints);
    }

    public static void drawHexFractal(Graphics g, int x0, int y0, int sideLength, int counter) {
        if (counter == 0) {
            return;
        } else {
            drawHexagon(g, x0, y0, sideLength * 3);
            int h2 = (int) (Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength / 2, 2)));
            drawHexagon(g, x0, y0, sideLength);
            drawHexFractal(g, x0, y0, sideLength / 3, counter - 1);
            drawHexagon(g, x0 + 2 * sideLength, y0, sideLength);
            drawHexFractal(g, x0 + 2 * sideLength, y0, sideLength / 3, counter - 1);
            drawHexagon(g, x0 + 3 * sideLength, y0 + 2 * h2, sideLength);
            drawHexFractal(g, x0 + 3 * sideLength, y0 + 2 * h2, sideLength / 3, counter - 1);
            drawHexagon(g, x0 + 2 * sideLength, y0 + 4 * h2, sideLength);
            drawHexFractal(g, x0 + 2 * sideLength, y0 + 4 * h2, sideLength / 3, counter - 1);
            drawHexagon(g, x0, y0 + 4 * h2, sideLength);
            drawHexFractal(g, x0, y0 + 4 * h2, sideLength / 3, counter - 1);
            drawHexagon(g, x0 - sideLength, y0 + 2 * h2, sideLength);
            drawHexFractal(g, x0 - sideLength, y0 + 2 * h2, sideLength / 3, counter - 1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 1600;
    static int HEIGHT = 1385;

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
