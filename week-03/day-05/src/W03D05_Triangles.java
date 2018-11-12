import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D05_Triangles {
    public static final Color LIGHTPURPLE = new Color(238, 130, 238, 255);
    public static void mainDraw(Graphics graphics) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How biq a square do you want to have filled with triangles, as a fraction of the canvas size (i.e.: 4 means 1/4)");
        int squareToFill = scanner.nextInt();
        int sideLengthOfSquare = (int) (Math.sqrt(WIDTH * HEIGHT / squareToFill));
        System.out.println("How many triangles do you want in the bottom row?");
        int howManyInBase = scanner.nextInt();
//        System.out.println("Do you want equilateral (e) or isosceles (i) triangles?");
        int baseLength = (int) ((sideLengthOfSquare - sideLengthOfSquare % howManyInBase) / howManyInBase);
        int h = (int) (Math.sqrt(Math.pow(baseLength, 2) - Math.pow(baseLength / 2, 2)));
        int x0 = (sideLengthOfSquare - howManyInBase * baseLength) / 2;
        int y0 = sideLengthOfSquare - (sideLengthOfSquare - howManyInBase * h) / 2;
//        graphics.setColor(Color.BLACK);
//        graphics.fillRect(x0, y0, sideLengthOfSquare, sideLengthOfSquare);
        graphics.setColor(LIGHTPURPLE);
        for (int i = 0; i < howManyInBase; i++) {
            for (int j = howManyInBase-i; j > 0; j--) {
//                variables x00 and y00 were introduced for debugging purposes
                int x00 = x0 + i * (baseLength / 2) + ((howManyInBase - i - j) * baseLength);
                int y00 = y0 - i * h;
                drawTriangle(graphics, x00, y00, baseLength, baseLength);
            }
        }
    }

    public static void drawTriangle(Graphics g, int x0, int y0, int baseLength, int isoscelesLength) {
        int nPoints = 3;
        int h = (int) (Math.sqrt(Math.pow(isoscelesLength, 2) - Math.pow(baseLength / 2, 2)));
        int[] xCoord = {x0, x0 + baseLength / 2, x0 + baseLength};
        int[] yCoord = {y0, y0 - h, y0};
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