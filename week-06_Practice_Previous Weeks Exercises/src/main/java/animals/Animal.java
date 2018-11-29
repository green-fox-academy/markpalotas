package main.java.animals;

public abstract class Animal {
    private String name;
    protected double age = 0;
    private boolean isAlive = true;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double age) {
        this(name);
        this.age = age;
    }

    public abstract String breed();

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void die() {
        this.isAlive = false;
    }
}
