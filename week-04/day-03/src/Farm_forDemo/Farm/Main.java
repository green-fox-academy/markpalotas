package Farm_forDemo.Farm;

public class Main {
    public static void main(String[] args) {
        Animal pig1 = new Animal("pig1");
        Animal pig2 = new Animal("pig2");
        Animal pig3 = new Animal("pig3");
        Animal pig4 = new Animal("pig4");
        Animal cow1 = new Animal("cow1");
        Animal cow2 = new Animal("cow2");
        Animal cow3 = new Animal("cow3");
        Animal cow4 = new Animal("cow4");
        Farm bigFarm = new Farm();
        System.out.println(bigFarm.emptySlots);
        bigFarm.addAnimal(pig1);
        bigFarm.addAnimal(pig2);
        System.out.println(bigFarm.emptySlots);
        System.out.println(bigFarm.totalSlots);
        Farm smallFarm = new Farm(5);
        System.out.println(smallFarm.emptySlots);
        smallFarm.addAnimal(new Animal("scrat"));
        smallFarm.addAnimal(new Animal("dog1"));
        smallFarm.addAnimal(new Animal("gizmo"));
        smallFarm.addAnimal(new Animal("cat"));
        smallFarm.addAnimal(new Animal("bull"));
        smallFarm.addAnimal(new Animal("skunk"));
        smallFarm.slaughter();
        System.out.println(smallFarm);
        System.out.println(bigFarm);
        bigFarm.breed();
        System.out.println(bigFarm);
        smallFarm.breed();
        System.out.println(smallFarm);
        smallFarm.breed();
    }
}
