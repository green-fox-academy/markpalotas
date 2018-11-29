package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super(6);
        this.name = "Electric Guitar";
        this.sound = "Twang";
    }

    public ElectricGuitar(int numberOfStrings) {
        this();
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void sound() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound);
    }
}
