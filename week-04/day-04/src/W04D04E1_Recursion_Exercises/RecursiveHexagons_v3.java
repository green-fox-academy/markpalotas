package W04D04E1_Recursion_Exercises;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveHexagons_v3 {

//    managed to include the step drawing the "main" hexagon (the largest one, that contains all the others)
//    in the recursive function. Not really elegant, though, as it is drawn each time the function calls
//    itself, not just once.

    public static void mainDraw(Graphics graphics) {
        drawRecursiveHexagons(graphics, WIDTH / 4, 0, WIDTH / 4, 5);
    }

    public static void drawHexagon(Graphics g, int x0, int y0, int sideLength) {
        int nPoints = 6;
        int h = (int) (Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength / 2, 2)));
        int[] xCoord = {x0, x0 + sideLength, x0 + sideLength * 3 / 2, x0 + sideLength, x0, x0 - sideLength / 2};
        int[] yCoord = {y0, y0, y0 + h, y0 + 2 * h, y0 + 2 * h, y0 + h};
        g.drawPolygon(xCoord, yCoord, nPoints);
    }

    public static void drawRecursiveHexagons(Graphics g, int x0, int y0, int sideLength, int counter) {
//        The first drawHexagon call (currently in line 31) could have been placed here, as well.
        if (counter == 0) {
            return;
        } else {
            drawHexagon(g, x0, y0, sideLength * 2);
            int h2 = (int) (Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength / 2, 2)));
            drawHexagon(g, x0, y0, sideLength);
            drawRecursiveHexagons(g, x0, y0, sideLength / 2, counter - 1);
            drawHexagon(g, x0 + 3 * sideLength / 2, y0 + h2, sideLength);
            drawRecursiveHexagons(g, x0 + 3 * sideLength / 2, y0 + h2, sideLength / 2, counter - 1);
            drawHexagon(g, x0, y0 + 2 * h2, sideLength);
            drawRecursiveHexagons(g, x0, y0 + 2 * h2, sideLength / 2, counter - 1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 1600;
    static int HEIGHT = 1600;

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
