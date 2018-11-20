package Garden;

public class Flower extends Plant {
    public Flower(String color) {
        super(color);
        this.setType(Type.flower);
        this.setPercentageOfWaterAbsorbed(75);
        this.setThirstThreshold(5);

    }
}
