import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E13_Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = WIDTH / 8;
        for (int i = 0; i < 8; i+=1) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j+=2) {
                    int posY = 0 + j * size;
                    baseSq(graphics, i * size, posY, size);
                    posY = posY + 2 * size;
                }
            } else {
                for (int j = 0; j < 8 ; j+=2) {
                    int posY = size + j * size;
                    baseSq(graphics, i * size, posY, size);
                    posY = posY + 2 * size;
                }
            }
        }
        graphics.clearRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < 8; i++) {
            int posY = (i % 2) * size;
            for (int j = 0; j < 8 ; j++) {
                baseSq(graphics, i * size, posY, size);
                posY = posY + 2 * size;
            }
        }
    }

    public static void baseSq(Graphics g, int x, int y, int s) {
        g.fillRect(x, y, s, s);
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