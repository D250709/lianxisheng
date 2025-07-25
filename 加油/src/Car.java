public class Car {

    private int fuel;

    public Car(int initialFuel) {
        this.fuel = initialFuel;
    }

    public void addFuel(int amount) {

        this.fuel += amount;
    }

    public int getFuel() {
        return fuel;
    }
}

