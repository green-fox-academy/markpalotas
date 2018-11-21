package Fractal_Koch;

import com.sun.org.apache.xml.internal.resolver.readers.XCatalogReader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        List<Integer> xCoord = new ArrayList<>(Arrays.asList(0, 50, 70, 100, 150));
        List<Integer> yCoord = new ArrayList<>(Arrays.asList(0, 0, 40, 0, 0));
//        generateCoord(xCoord, yCoord);
        graphics.drawLine(xCoord.get(0), yCoord.get(0), xCoord.get(1), yCoord.get(1));
        graphics.drawLine(xCoord.get(1), yCoord.get(1), xCoord.get(2), yCoord.get(2));
        graphics.drawLine(xCoord.get(2), yCoord.get(2), xCoord.get(3), yCoord.get(3));
        graphics.drawLine(xCoord.get(3), yCoord.get(3), xCoord.get(4), yCoord.get(4));
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

//    public static void generateCoord(List<Integer> xCoord, List<Integer> yCoord) {
//        double p1 = 2.0 / 3.0;
//        double p2 = 1.0 / 3.0;
//        double c = Math.cos(Math.toRadians(60));
//        double s = Math.sin(Math.toRadians(60));
//        List<Integer> xCoordTemp = new ArrayList<>();
//        List<Integer> yCoordTemp = new ArrayList<>();
//        for (int i = 0; i < xCoord.size() - 1; i++) {
//            int xA = xCoord.get(i);
//            int yA = yCoord.get(i);
//            int yB = yCoord.get(i + 1);
//            int xB = xCoord.get(i + 1);
//            int xC = (int) (xCoord.get(i) * p1 + xCoord.get(i + 1) * p2);
//            int yC = (int) (yCoord.get(i) * p1 + yCoord.get(i + 1) * p2);
//            int xD = (int) (xCoord.get(i) * p2 + xCoord.get(i + 1) * p1);
//            int yD = (int) (yCoord.get(i) * p2 + yCoord.get(i + 1) * p1);
//            int xE = (int) ((xD - xC) * c - (yD - yC) * s + xC);
//            int yE = (int) ((yD - yC) * c + (xD - xC) * s + yC);
//            xCoordTemp.add(xA);
//            xCoordTemp.add(xC);
//            xCoordTemp.add(xE);
//            xCoordTemp.add(xD);
//            xCoordTemp.add(xB);
//            yCoordTemp.add(yA);
//            yCoordTemp.add(yC);
//            yCoordTemp.add(yE);
//            yCoordTemp.add(yD);
//            yCoordTemp.add(yB);
//            xCoord = xCoordTemp;
//            yCoord = yCoordTemp;
//        }
//    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
