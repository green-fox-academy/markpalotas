import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E02_ColoredBox_v2 {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        // x coordinates of vertices
        int x[] = { 100, 300, 300, 100};

        // y coordinates of vertices
        int y[] = { 100, 100, 300, 300};

        // number of vertices
        int numberofpoints = 4;

        // join the adjacent vertices
        for (int i = 0; i < numberofpoints - 1; i++) {
            int colorR = (int) (Math.random() * 255 + 1);
            int colorG = (int) (Math.random() * 255 + 1);
            int colorB = (int) (Math.random() * 255 + 1);
            graphics.setColor(new Color(colorR, colorG, colorB));
            graphics.drawLine(x[i], y[i], x[i + 1], y[i + 1]);
        }
        // join the first and last vertex
        int colorR = (int) (Math.random() * 255 + 1);
        int colorG = (int) (Math.random() * 255 + 1);
        int colorB = (int) (Math.random() * 255 + 1);
        graphics.setColor(new Color(colorR, colorG, colorB));
        graphics.drawLine(x[0], y[0], x[numberofpoints - 1], y[numberofpoints - 1]);
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