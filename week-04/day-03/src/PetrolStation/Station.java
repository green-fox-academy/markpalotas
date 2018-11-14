package PetrolStation;

public class Station {
    double gasAmount;

    public Station(double gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        this.gasAmount -= car.capacity;
        car.refill();
    }
}
