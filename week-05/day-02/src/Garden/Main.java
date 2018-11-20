package Garden;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree1 = new Tree("purple");
        Tree tree2 = new Tree("orange");
        Garden myGarden = new Garden("My Beautiful Garden");
        myGarden.addToGarden(flower1);
        myGarden.addToGarden(flower2);
        myGarden.addToGarden(tree1);
        myGarden.addToGarden(tree2);
        myGarden.introGarden();
        System.out.println(myGarden.toString());
        int waterAmount = 40;
        myGarden.waterTheGarden(waterAmount);
        System.out.println("Watering with " + waterAmount + " liters.");
        System.out.println(myGarden.toString());
        waterAmount = 70;
        myGarden.waterTheGarden(waterAmount);
        System.out.println("Watering with " + waterAmount + " liters.");
        System.out.println(myGarden.toString());
    }
}
