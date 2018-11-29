package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super(4);
        this.name = "Bass Guitar";
        this.sound = "Duum-duum-duum";
    }

    public BassGuitar(int numberOfStrings) {
        this();
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void sound() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound);
    }
}
