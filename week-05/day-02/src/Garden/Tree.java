package Garden;

public class Tree extends Plant {
    public Tree(String color) {
        super(color);
        this.setType(Type.tree);
        this.setPercentageOfWaterAbsorbed(40);
        this.setThirstThreshold(10);

    }
}
