// Solution with a single for loop (but several embedded IFs)


import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E14_FunctionToCenter_v2 {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int freq = 40;

        for (int i = 0; i < ((2 * (WIDTH + HEIGHT)) / freq); i++) {
            int x;
            int y;
            if (i * freq <= WIDTH) {
                x = i * freq;
                y = 0;
            } else if (i * freq <= WIDTH + HEIGHT) {
                x = WIDTH;
                y = (i - (WIDTH / freq)) * freq;
            } else if (i * freq <= 2 * WIDTH + HEIGHT) {
                x = WIDTH - ((i - ((WIDTH + HEIGHT )/ freq)) * freq);
                y = 800;
            } else {
                x = 0;
                y = HEIGHT - ((i - ((2 * WIDTH + HEIGHT) / freq)) * freq);
            }
            firstLine(graphics, x, y);
        }
    }

    public static void firstLine(Graphics g, int x, int y) {
        g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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