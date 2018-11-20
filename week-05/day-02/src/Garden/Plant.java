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

    public Plant(String color) {
        this.color = color;
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

    public int getThirstThreshold() {
        return thirstThreshold;
    }

    public void setThirstThreshold(int thirstThreshold) {
        this.thirstThreshold = thirstThreshold;
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

    public int getPercentageOfWaterAbsorbed() {
        return percentageOfWaterAbsorbed;
    }

    public void setPercentageOfWaterAbsorbed(int percentageOfWaterAbsorbed) {
        this.percentageOfWaterAbsorbed = percentageOfWaterAbsorbed;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
