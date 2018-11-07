import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E01_LineInTheMiddle {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH, HEIGHT / 2, 0, HEIGHT / 2);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH / 2, HEIGHT, WIDTH / 2, 0);

        graphics.setColor(Color.RED);
        graphics.fillRect(10, 10, 50, 50);

        graphics.setColor(Color.BLACK);
        graphics.fillRect(20, 20, 50, 50);

        graphics.clearRect(30, 30, 10, 10);
        
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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