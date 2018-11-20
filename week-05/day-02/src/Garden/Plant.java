package Garden;

public class Plant {
    private Type type;
    private String color;
    private String name = color;
    private int currentWater = 0;
    private int thirstThreshold;
    private boolean needsWater = true;
    private int percentageOfWaterAbsorbed;

    public enum Type {tree, flower}

    public Plant(String color, Type type, int percentageOfWaterAbsorbed, int thirstThreshold) {
        this.color = color;
        this.type = type;
        this.percentageOfWaterAbsorbed = percentageOfWaterAbsorbed;
        this.thirstThreshold = thirstThreshold;
    }

    public void checkThirst() {
        needsWater = currentWater < thirstThreshold;
    }

    public boolean isNeedsWater() {
        return needsWater;
    }

    public void water(int liters) {
        currentWater += liters * percentageOfWaterAbsorbed / 100;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        checkThirst();
        if (needsWater) {
            return "The " + getColor() + " " + getType() + " needs water.";
        } else {
            return "The " + getColor() + " " + getType() + " doesn't need water.";
        }
    }
}
