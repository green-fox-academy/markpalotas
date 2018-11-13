package Animal;

public class Animal {
    String name;
    int hunger = 50;
    int thirst = 50;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        this.hunger--;
        System.out.println("Currently, your " + name + " is " + hunger + " hungry.");
    }

    public void drink() {
        this.thirst--;
        System.out.println("Currently, your " + name + " is " + thirst + " thirsty.");
    }

    public void play() {
        this.thirst++;
        this.hunger++;
        System.out.println("Currently, your " + name + " is " + hunger + " hungry and " + thirst + " thirsty.");
    }

}
