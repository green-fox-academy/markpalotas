import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E14_FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        for (int i = 0; i < WIDTH / 20 + 1; i++) {
            firstLine(graphics, 0, i * 20);
        }
        for (int i = 0; i < WIDTH / 20 + 1; i++) {
            firstLine(graphics, 800, i * 20);
        }
        for (int i = 0; i < WIDTH / 20 + 1; i++) {
            firstLine(graphics, i * 20, 0);
        }
        for (int i = 0; i < WIDTH / 20 + 1; i++) {
            firstLine(graphics, i * 20, 800);
        }
        graphics.clearRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < 4 * (WIDTH / 20)+1; i++) {
            if (i <= WIDTH / 20) {
                firstLine(graphics, i * 20, 0);
            } else if (i <= 2 * (WIDTH / 20)) {
                firstLine(graphics, 800, (i-40) * 20);
            } else if (i <= 3 * (WIDTH / 20)) {
                firstLine(graphics, (i-80) * 20, 800);
            } else firstLine(graphics, 0, (i - 120) * 20);
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