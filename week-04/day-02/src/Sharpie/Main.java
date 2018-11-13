package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie green = new Sharpie("green", 4);
        Sharpie blue = new Sharpie("blue", 5);
        Sharpie red = new Sharpie("red", 5.5);
        green.use();
        green.use();
        green.use();
        red.use();
        blue.use();
        System.out.println(green.inkAmount);
        blue.width = 10;
        System.out.println(blue.width);
        System.out.println(green.width);
    }
}
