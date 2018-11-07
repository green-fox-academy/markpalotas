// TO BE DONE using a multi-dimensional array, as well

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W03D03E15_ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[] boxArray = {10, 10, 290, 10, 290, 290, 10, 290};
        connector(graphics, boxArray);

        graphics.clearRect(0, 0, WIDTH, HEIGHT);

        int[] foxArray = {50, 100, 70, 70, 80, 90, 90, 90, 100, 70, 120, 100, 85, 130, 50, 100};
        for (int i = 0; i < foxArray.length - 1; i++) {
            int zoomfactor = 5;
            if (i % 2 == 0) {
                foxArray[i] = foxArray[0] + zoomfactor * (foxArray[i] - foxArray[0]);
            } else foxArray[i] = foxArray[1] + zoomfactor * (foxArray[i] - foxArray[1]);
        }
//        the following lines (moving the whole drawing) does not yet work, conflicts probably with the IF part of the connector function
        for (int i = 0; i < foxArray.length; i++) {
            int movefactor = 100;
            foxArray[i] = foxArray[i] + movefactor;
        }
        connector(graphics, foxArray);

        graphics.clearRect(0, 0, WIDTH, HEIGHT);

        int[][] multiArray = {{10, 10}, {290, 10}, {290, 290}, {10, 290}, {10, 10}};
        int[][] multiArray2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        multiConnector(graphics, multiArray2);

//        int[] foxArray2 = {100, 150, 120, 120, 130, 140, 140, 140, 150, 120, 170, 150, 135, 185, 100, 150};
//        connector(graphics, foxArray2);

    }

    public static void connector(Graphics g, int[] inpArray) {
        g.setColor(Color.GREEN);
        for (int i = 0; i < (inpArray.length / 2) - 1; i++) {
            g.drawLine(inpArray[2 * i], inpArray[2 * i + 1], inpArray[2 * i + 2], inpArray[2 * i + 3]);
        }
        if (inpArray[0] != inpArray[inpArray.length - 2] | inpArray[1] != inpArray[inpArray.length - 1]) {
            g.drawLine(inpArray[inpArray.length - 2], inpArray[inpArray.length - 1], inpArray[0], inpArray[1]);
        }
    }

    public static void multiConnector(Graphics g, int[][] inpArray) {
        g.setColor(Color.GREEN);
        for (int i = 0; i < inpArray.length - 1; i++) {
            g.drawLine(inpArray[i][0], inpArray[i][1], inpArray[i + 1][0], inpArray[i + 1][1]);
        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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