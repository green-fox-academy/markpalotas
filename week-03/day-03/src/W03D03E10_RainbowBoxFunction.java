import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E10_RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int size0 = (int) (100 + ((Math.random() * 100 + 1)));
        int size1 = size0;
        int steps = 10;

        for (int i = 0; i < (WIDTH-size0)/steps ; i++) {
            fillSq(graphics, size1);
            size1 = size1 + steps;
        }
    }

    public static void fillSq(Graphics g, int s) {
        g.setColor(new Color((int)(Math.random()*255+1),(int)(Math.random()*255+1),(int)(Math.random()*255+1)));
        g.drawRect((WIDTH - s) / 2, (HEIGHT - s) / 2, s, s);
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