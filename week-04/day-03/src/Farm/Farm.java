package Farm;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> farmAnimals = new ArrayList<Animal>();
    int totalSlots = 100;
    int emptySlots = totalSlots;

    public Farm() {
    }

    public Farm(int totalSlots) {
        this.totalSlots = totalSlots;
        this.emptySlots = totalSlots;
    }

    public List<Animal> addAnimal(Animal animal) {
        if (this.emptySlots > 0) {
            farmAnimals.add(animal);
            this.emptySlots--;
        } else {
            System.out.println("This farm has no place for further animals");
        }
        return farmAnimals;
    }

    public List<Animal> removeAnimal(Animal animal) {
        farmAnimals.remove(farmAnimals.indexOf(animal));
        this.emptySlots++;
        return farmAnimals;
    }

    public List<Animal> breed() {
        Animal pregnant = farmAnimals.get((int) (Math.random() * (farmAnimals.size())));
        addAnimal(pregnant);
        return farmAnimals;
    }

    public List<Animal> slaughter() {
        if (!farmAnimals.isEmpty()) {
            removeAnimal(findLeastHungry());
        } else {
            System.out.println("There's no animal to slaughter at this farm");
        }
        return farmAnimals;
    }

    public Animal findLeastHungry() {
        Animal leastHungry = farmAnimals.get(0);
        for (Animal animal : farmAnimals) {
            if (animal.hunger < leastHungry.hunger) {
                leastHungry = animal;
            }
        }
        return leastHungry;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmAnimals=" + farmAnimals +
                ", totalSlots=" + totalSlots +
                ", emptySlots=" + emptySlots +
                '}';
    }
}
