package main.java.animals;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, double age) {
        super(name, age);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }
}
