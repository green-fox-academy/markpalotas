import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D05_LinePlay {
    public static final Color PURPLE = new Color(102, 0, 153);
    public static void mainDraw(Graphics graphics) {
        int freq = 15;
        graphics.setColor(PURPLE);
        for (int i = 0; i < freq - 1; i++) {
            drawLines(graphics, WIDTH, HEIGHT - (i + 1) * (HEIGHT / freq), WIDTH - (i + 1) * (WIDTH / freq), 0);
        }
//        graphics.setColor(Color.decode("#32CD32"));
//        below: alternative method for providing color in hex
        graphics.setColor(new Color(0x32CD32));
        for (int i = 0; i < freq - 1; i++) {
            drawLines(graphics, 0, (i + 1) * (HEIGHT / freq), (i + 1) * (WIDTH / freq), HEIGHT);
        }
    }

    public static void drawLines(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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