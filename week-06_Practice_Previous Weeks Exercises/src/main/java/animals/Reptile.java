package main.java.animals;

public class Reptile extends Animal implements BreedableByEgg {
    private int minNumberOfEggs = 1;
    private int maxNumberOfEggs = 3;

    public Reptile(String name) {
        super(name);
    }

    public Reptile(String name, double age) {
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
