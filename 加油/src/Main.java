//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car(10);
        System.out.println("初始油量: " + car.getFuel());
        GasStation station = new GasStation();
        station.refuel(car, 5);
        System.out.println("加油后的油量: " + car.getFuel());
    }
}
