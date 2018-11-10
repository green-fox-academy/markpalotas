import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D05_SuperHexagon {
    public static final Color LIGHTPURPLE = new Color(238, 130, 238, 255);
    public static void mainDraw(Graphics graphics) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How biq a square do you want to have filled with triangles, as a fraction of the canvas size (i.e.: 4 means 1/4)");
        int squareToFill = scanner.nextInt();
        int sideLengthOfSquare = (int) (Math.sqrt(WIDTH * HEIGHT / squareToFill));
        int sideLength = (int) (sideLengthOfSquare / 13);
        int h = (int) (Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength / 2, 2)));
        int x0 = (WIDTH - 11 * sideLength) / 2;
        int y0 = HEIGHT / 2 + 3 * h;
        graphics.setColor(LIGHTPURPLE);
        for (int i = -3; i < 4; i++) {
            for (int j = 0; j < 7 - Math.abs(i); j++) {
//                variables x00 and y00 are being introduced for debugging purposes
                int x00 = x0 + (i + 3) * 3 * sideLength / 2;
                int y00 = y0 + (3 - Math.abs(i)) * h - j * 2 * h;
                drawHexagon(graphics, x00, y00, sideLength);
            }
        }
    }

    public static void drawHexagon(Graphics g, int x0, int y0, int sideLength) {
        int nPoints = 6;
        int h = (int) (Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength / 2, 2)));
        int[] xCoord = {x0, x0 + sideLength / 2, x0 + 3 * sideLength / 2, x0 + 2 * sideLength, x0 + 3 * sideLength / 2, x0 + sideLength / 2};
        int[] yCoord = {y0, y0 - h, y0 - h, y0, y0 + h, y0 + h};
        g.drawPolygon(xCoord, yCoord, nPoints);
    }

    // Don't touch the code below
    static int WIDTH = 1500;
    static int HEIGHT = 1500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        commented out because it makes the main function run multiple (3) times
//        panel.setBackground(Color.BLACK);
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