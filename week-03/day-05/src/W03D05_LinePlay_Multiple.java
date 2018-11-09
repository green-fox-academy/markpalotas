import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D05_LinePlay_Multiple {
    public static final Color PURPLE = new Color(102, 0, 153);
    public static void mainDraw(Graphics graphics) {
        int freq = 15;
        int originX = 0;
        int originY = HEIGHT;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pairs of LinePlay would you like to see?");
        int howmany = scanner.nextInt();
        int size = WIDTH/((int) (Math.sqrt(howmany)));
        drawLinePlay(graphics, originX, originY, size, freq);
        drawLinePlayMirror(graphics, originX, originY, size, freq);
    }

    public static void drawLines(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    public static void drawLinePlay(Graphics g, int originX, int originY, int size, int freq) {
        g.setColor(PURPLE);
        for (int i = 0; i < freq - 1; i++) {
            drawLines(g, originX + (i + 1) * (size / freq), originY, originX, originY - size+(i+1)*(size/freq));
        }
    }

    public static void drawLinePlayMirror(Graphics g, int originX, int originY, int size, int freq) {
        g.setColor(new Color(0x32CD32));
        for (int i = 0; i < freq - 1; i++) {
            drawLines(g, originX+size-(i+1)*(size/freq), originY-size, originX+size, originY-(i+1)*(size/freq));
        }
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