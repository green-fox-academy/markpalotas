import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E02_ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        int startX = 100;
        int startY = 100;
        int rectWidth = 200;
        int rectHeight = 313;
        graphics.setColor(Color.BLACK);
        graphics.drawLine(startX, startY, startX + rectWidth, startY);
        graphics.setColor(Color.RED);
        graphics.drawLine(startX + rectWidth, startY, startX + rectWidth, startY + rectHeight);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(startX + rectWidth, startY + rectHeight, startX, startY + rectHeight);
        graphics.setColor(Color.PINK);
        graphics.drawLine(startX, startY + rectHeight, startX, startY);
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