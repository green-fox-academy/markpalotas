package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private String name;
    private List<Plant> flowersAndTrees = new ArrayList<>();

    public Garden(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToGarden(Plant plant) {
        flowersAndTrees.add(plant);
    }

    public List<Integer> countTypes() {
        int treeCount = 0;
        int flowerCount = 0;
        List<Integer> counts = new ArrayList<>();
        for (Plant plant : flowersAndTrees) {
            if (plant instanceof Tree) {
                treeCount++;
            } else if (plant instanceof Flower) {
                flowerCount++;
            }
        }
        counts.add(treeCount);
        counts.add(flowerCount);
        return counts;
    }

    public String treeColor() {
        String treeColors = "";
        for (Plant plant : flowersAndTrees) {
            if (plant.getType() == Plant.Type.tree) {
                if (treeColors.equals("")) {
                    treeColors = plant.getColor();
                } else {
                    treeColors = treeColors + ", " + plant.getColor();
                }
            }
        }
        return treeColors;
    }

    public String flowerColor() {
        String flowerColors = "";
        for (Plant plant : flowersAndTrees) {
            if (plant.getType() == Plant.Type.flower) {
                if (flowerColors.equals("")) {
                    flowerColors = plant.getColor();
                } else {
                    flowerColors = flowerColors + ", " + plant.getColor();
                }
            }
        }
        return flowerColors;
    }

    public void introGarden() {
        System.out.println("This is our garden called " + name + ", which contains " + countTypes().get(0) + " trees and " + countTypes().get(1) + " flowers. The trees are " + treeColor() + ", whereas the flowers are of the following colors: " + flowerColor() + ".");
    }

    public int countThirsty() {
        int counter = 0;
        for (Plant plant : flowersAndTrees) {
            plant.checkThirst();
            if (plant.isNeedsWater()) {
                counter++;
            }
        }
        return counter;
    }

    public void waterTheGarden(int totalLiters) {
        for (Plant plant : flowersAndTrees) {
            plant.water(totalLiters / countThirsty());
        }
    }

    @Override
    public String toString() {
        String allPlants = "";
        for (Plant plant : flowersAndTrees) {
            allPlants = allPlants + plant.toString() + "\n";
        }
        return allPlants;
    }
}
