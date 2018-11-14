package Farm;

public class Animal {
    String name;
    int hunger = (int) (Math.random() * 51);
    int thirst = (int) (Math.random() * 51);

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

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}
