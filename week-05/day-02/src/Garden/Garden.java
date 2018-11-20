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

    public void addToGarden(Flower flower) {
        flowersAndTrees.add(flower);
    }

    public void addToGarden(Tree tree) {
        flowersAndTrees.add(tree);
    }

    public int countTrees() {
        int counter = 0;
        for (int i = 0; i < flowersAndTrees.size(); i++) {
            if (flowersAndTrees.get(i).getType() == Plant.Type.tree) {
                counter++;
            }
        }
        return counter;
    }

    public int countFlowers() {
        int counter = 0;
        for (int i = 0; i < flowersAndTrees.size(); i++) {
            if (flowersAndTrees.get(i).getType() == Plant.Type.flower) {
                counter++;
            }
        }
        return counter;
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
        System.out.println("This is our garden called " + name + ", which contains " + countTrees() + " trees and " + countFlowers() + " flowers. The trees are " + treeColor() + ", whereas the flowers are of the following colors: " + flowerColor() + ".");
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

    public void soutThirsty() {
        int counter = 0;
        for (Plant plant : flowersAndTrees) {
            plant.checkThirst();
            if (plant.isNeedsWater()) {
                System.out.println("The " + plant.getColor() + " " + plant.getType() + " needs water.");
                counter++;
            } else {
                System.out.println("The " + plant.getColor() + " " + plant.getType() + " doesn't need water.");
            }
        }
    }

    public void waterTheGarden(int totalLiters) {
        for (Plant plant : flowersAndTrees) {
            plant.water(totalLiters / countThirsty());
        }
    }
}
