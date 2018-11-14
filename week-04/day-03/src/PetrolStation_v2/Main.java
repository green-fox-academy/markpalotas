package PetrolStation_v2;

public class Main {

    public static void main(String[] args) {
        Station station1 = new Station(1000);
        Car car1 = new Car();
        Car car2 = new Car();
        car2.capacity = 50;
        Car car3 = new Car();
        car3.capacity = 200;
        station1.refill(car1);
        System.out.println(station1.gasAmount);
        station1.refill(car2);
        System.out.println(station1.gasAmount);
        station1.refill(car3);
        System.out.println(car1.gasAmount);
        System.out.println(car2.gasAmount);
        System.out.println(car3.gasAmount);
        System.out.println(station1.gasAmount);
        System.out.println("This one seems to work, as well :)");
    }
}
