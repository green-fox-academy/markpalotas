package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        drawTriangleFractal(graphics, 0, (HEIGHT - (int) (2 * (Math.sqrt(Math.pow(WIDTH / 2, 2) - Math.pow(WIDTH / 2 / 2, 2))))) / 2, WIDTH / 2, 8);
    }

    public static void drawTriangle(Graphics g, int x0, int y0, int base) {
        int h = (int) (Math.sqrt(Math.pow(base, 2) - Math.pow(base / 2, 2)));
        g.drawLine(x0, y0, x0 + base, y0);
        g.drawLine(x0 + base, y0, x0 + base / 2, y0 + h);
        g.drawLine(x0 + base / 2, y0 + h, x0, y0);
    }

    public static void drawTriangleFractal(Graphics g, int x0, int y0, int base, int counter) {
        if (counter == 0) {
            return;
        } else {
            int h = (int) (Math.sqrt(Math.pow(base, 2) - Math.pow(base / 2, 2)));
            drawTriangle(g, x0, y0, base);
            drawTriangleFractal(g, x0, y0, base / 2, counter - 1);
            drawTriangle(g, x0 + base, y0, base);
            drawTriangleFractal(g, x0 + base, y0, base / 2, counter - 1);
            drawTriangle(g, x0 + base / 2, y0 + h, base);
            drawTriangleFractal(g, x0 + base / 2, y0 + h, base / 2, counter - 1);
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
