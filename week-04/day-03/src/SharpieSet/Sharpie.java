package SharpieSet;

public class Sharpie {
    String color;
    double width;
    double inkAmount = 100;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        this.inkAmount -= .5;
        System.out.println("Remaining ink: " + inkAmount);
    }
}
