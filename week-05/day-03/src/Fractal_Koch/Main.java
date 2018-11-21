//package Fractal_Koch;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.List;
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//public class Main {
//    public static void mainDraw(Graphics graphics) {
//    }
//
//    public List<Integer> generateXCoord(List<Integer> initList) {
//
//    }
//
//    // Don't touch the code below
//    static int WIDTH = 1600;
//    static int HEIGHT = 1385;
//
//    public static void main(String[] args) {
//        JFrame jFrame = new JFrame("Drawing");
//        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        ImagePanel panel = new ImagePanel();
//        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        jFrame.add(panel);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.setVisible(true);
//        jFrame.pack();
//    }
//
//    static class ImagePanel extends JPanel {
//        @Override
//        protected void paintComponent(Graphics graphics) {
//            super.paintComponent(graphics);
//            mainDraw(graphics);
//        }
//    }
//}
