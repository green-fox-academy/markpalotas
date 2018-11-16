package W04D04E1_Recursion_Exercises;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveSquares_neat {
    public static void mainDraw(Graphics graphics) {
        drawRectangles(graphics, 0, 0, WIDTH/3, 7);
    }


    public static void drawRectangles(Graphics g, int x0, int y0, int length, int counter) {
        if (counter == 0) {
            return;
        } else {
            g.drawRect(x0 + length, y0, length, length);
            drawRectangles(g, x0 + length, y0, length / 3, counter - 1);
            g.drawRect(x0 + 2 * length, y0 + length, length, length);
            drawRectangles(g, x0 + 2 * length, y0 + length, length / 3, counter - 1);
            g.drawRect(x0 + length, y0 + 2 * length, length, length);
            drawRectangles(g, x0 + length, y0 + 2 * length, length / 3, counter - 1);
            g.drawRect(x0, y0 + length, length, length);
            drawRectangles(g, x0, y0 + length, length / 3, counter - 1);
        }
    }


    // Don't touch the code below
    static int WIDTH = 1520;
    static int HEIGHT = 1520;

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