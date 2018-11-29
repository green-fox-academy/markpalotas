package main.java.animals;

public class Bird extends Animal implements BreedableByEgg {
    private int minNumberOfEggs = 1;
    private int maxNumberOfEggs = 12;

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, double age) {
        super(name, age);
    }

    @Override
    public String breed() {
        return breedByEgg();
    }

    @Override
    public String breedByEgg() {
        return "laying " + minNumberOfEggs + " to " + maxNumberOfEggs + " eggs.";
    }
}
