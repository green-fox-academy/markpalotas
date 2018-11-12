import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E16_StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        int howManyStarz = (int) (50 + Math.random() * 150);

        for (int i = 0; i < howManyStarz; i++) {
            int x = (int) (Math.random() * 800);
            int y = (int) (Math.random() * 800);
            int s = (int) (2 + (Math.random() * 15));
            stars(graphics, x, y, s);
        }
    }

    public static void stars(Graphics g, int x, int y, int s) {
//        g.setColor(Color.getHSBColor(50, 0, 5));
        g.setColor(new Color(255, 255, 255, (int) (50 + (Math.random() * 180 + 1))));
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
            this.setBackground(Color.BLACK);
            mainDraw(graphics);
        }
    }
}