package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics) {
        squareBorder(graphics, WIDTH / 4, WIDTH / 4, WIDTH / 2, 60);
    }

    public static void drawSqGridFractal(Graphics g, int x0, int y0, int sideLength, int counter) {
        if (counter == 0) {
            return;
        } else {

        }
    }

    public static void squareBorder(Graphics g, int x0, int y0, int sidelength, int border) {
        g.setColor(Color.BLACK);
        g.fillRect(x0,y0,sidelength,sidelength);
        g.setColor(Color.WHITE);
        g.fillRect(x0 + border, y0 + border, sidelength - 2 * border, sidelength - 2 * border);
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
