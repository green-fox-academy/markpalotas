package W04D04E1_Recursion_Exercises;

import javax.swing.*;

import java.awt.*;
import java.rmi.MarshalException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveSquares {
    public static void mainDraw(Graphics graphics) {
        drawRectangles(graphics, 0, 0, WIDTH/3, 7);
//        int x0 = 0;
//        int y0 = 0;
//        int length = WIDTH / 3;
//        drawRectangles(graphics, x0, y0, length);
//        int x1 = x0 + length;
//        int y1 = y0;
//        int x2 = x0 + 2 * length;
//        int y2 = y0 + length;
//        int x3 = x0 + length;
//        int y3 = y0 + 2 * length;
//        int x4 = x0;
//        int y4 = y0 + length;
//        length = length / 3;
//        drawRectangles(graphics, x1, y1, length);
//        drawRectangles(graphics, x2, y2, length);
//        drawRectangles(graphics, x3, y3, length);
//        drawRectangles(graphics, x4, y4, length);
//        int x11 = x1 + length;
//        int y11 = y1;
//        int x12 = x1 + 2 * length;
//        int y12 = y1 + length;
//        int x13 = x1 + length;
//        int y13 = y1 + 2 * length;
//        int x14 = x1;
//        int y14 = y1 + length;
//        int x21 = x2 + length;
//        int y21 = y2;
//        int x22 = x2 + 2 * length;
//        int y22 = y2 + length;
//        int x23 = x2 + length;
//        int y23 = y2 + 2 * length;
//        int x24 = x2;
//        int y24 = y2 + length;
//        int x31 = x3 + length;
//        int y31 = y3;
//        int x32 = x3 + 2 * length;
//        int y32 = y3 + length;
//        int x33 = x3 + length;
//        int y33 = y3 + 2 * length;
//        int x34 = x3;
//        int y34 = y3 + length;
//        int x41 = x4 + length;
//        int y41 = y4;
//        int x42 = x4 + 2 * length;
//        int y42 = y4 + length;
//        int x43 = x4 + length;
//        int y43 = y4 + 2 * length;
//        int x44 = x4;
//        int y44 = y4 + length;
//        length = length / 3;
//        drawRectangles(graphics, x11, y11, length);
//        drawRectangles(graphics, x12, y12, length);
//        drawRectangles(graphics, x13, y13, length);
//        drawRectangles(graphics, x14, y14, length);
//        drawRectangles(graphics, x21, y21, length);
//        drawRectangles(graphics, x22, y22, length);
//        drawRectangles(graphics, x23, y23, length);
//        drawRectangles(graphics, x24, y24, length);
//        drawRectangles(graphics, x31, y31, length);
//        drawRectangles(graphics, x32, y32, length);
//        drawRectangles(graphics, x33, y33, length);
//        drawRectangles(graphics, x34, y34, length);
//        drawRectangles(graphics, x41, y41, length);
//        drawRectangles(graphics, x42, y42, length);
//        drawRectangles(graphics, x43, y43, length);
//        drawRectangles(graphics, x44, y44, length);

    }


    public static void drawRectangles(Graphics g, int x0, int y0, int length, int counter) {
        if (counter == 0) {
            return;
        } else {
            int a = x0 + length;
            int b = x0 + 2 * length;
            int c = y0 + length;
            int d = y0 + 2 * length;
            g.drawRect(x0 + length, y0, length, length);
            drawRectangles(g, a, y0, length / 3, counter - 1);
            g.drawRect(x0 + 2 * length, y0+length, length, length);
            drawRectangles(g, b, c, length / 3, counter - 1);
            g.drawRect(x0 + length, y0 + 2 * length, length, length);
            drawRectangles(g, a, d, length / 3, counter - 1);
            g.drawRect(x0, y0 + length, length, length);
            drawRectangles(g, x0, c, length / 3, counter - 1);
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