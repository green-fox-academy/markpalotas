package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        super(4);
        this.name = "Violin";
        this.sound = "Screech";
    }

    public Violin(int numberOfStrings) {
        this();
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void sound() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound);
    }
}
