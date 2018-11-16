package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String name;
    private List<Pirate> crew = new ArrayList<>();
    private int crewSize;
    private int indexOfCapt;

    public Ship() {
        this.crewSize = (int) (1 + Math.random() * 50);
    }

    public Ship(String shipName) {
        this.name = shipName;
        this.crewSize = (int) (1 + Math.random() * 50);
    }

    public void fillShip() {
        for (int i = 0; i < crewSize; i++) {
            crew.add(new Pirate("Pirate" + i + " on " + this.name));
        }
        for (Pirate pirate : crew) {
            pirate.assignShip(this.name);
        }
        indexOfCapt = (int) (Math.random() * crewSize);
        crew.get(indexOfCapt).appointCaptain();
    }

    public int countAliveCrew() {
        int counter = 0;
        for (int i = 0; i < crewSize; i++) {
            if (crew.get(i).isAlive()) {
                counter++;
            }
        }
        return counter;
    }

    public void shipInfo() {
        System.out.println("Number of crew members that are alive: " + countAliveCrew());
        System.out.println("Capt'n " + crew.get(indexOfCapt));
    }

    public void battle(Ship ship) {
    }
}
