package PetrolStation;

public class Car {
    double gasAmount = 0;
    double capacity = 100;

    public Car() {
    }

    public void refill() {
        this.gasAmount += capacity;
    }

}
