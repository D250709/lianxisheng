import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 主类，包含租赁系统的逻辑
public class Main {
    // 创建一个汽车列表，存储所有汽车
    private static List<Car> cars = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 初始化一些汽车
        cars.add(new Car("Toyota", "Corolla", "Red", 50.0));
        cars.add(new Car("Honda", "Civic", "Blue", 45.0));
        cars.add(new Car("BMW", "X5", "Black", 100.0));
        cars.add(new Car("Ford", "Mustang", "Yellow", 80.0));

        while (true) {
            System.out.println("\n请选择操作：");
            System.out.println("1. 查看可用汽车");
            System.out.println("2. 租赁汽车");
            System.out.println("3. 还车");
            System.out.println("4. 退出");
            System.out.print("输入你的选择: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 读取换行符

            switch (choice) {
                case 1:
                    viewAvailableCars();
                    break;
                case 2:
                    rentCar();
                    break;
                case 3:
                    returnCar();
                    break;
                case 4:
                    System.out.println("退出系统");
                    System.exit(0);
                default:
                    System.out.println("无效的选择");
            }
        }
    }

    // 查看可用汽车
    private static void viewAvailableCars() {
        System.out.println("\n可用汽车列表:");
        for (Car car : cars) {
            if (!car.isRented()) {
                System.out.println(car);
            }
        }
    }
    // 租赁汽车
    private static void rentCar() {
        System.out.print("请输入要租赁的汽车品牌: ");
        String brand = scanner.nextLine();
        System.out.print("请输入要租赁的汽车型号: ");
        String model = scanner.nextLine();
        System.out.print("请输入租赁天数: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // 读取换行符

        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand) && car.getModel().equalsIgnoreCase(model) && !car.isRented()) {
                Rental rental = new Rental(days, car);
                car.rentCar();
                System.out.println("租赁成功！总租金为: " + rental.getTotalRent());
                return;
            }
        }
        System.out.println("没有找到可租赁的汽车或汽车已被租走");
    }

    // 还车
    private static void returnCar() {
        System.out.print("请输入要还的汽车品牌: ");
        String brand = scanner.nextLine();
        System.out.print("请输入要还的汽车型号: ");
        String model = scanner.nextLine();

        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand) && car.getModel().equalsIgnoreCase(model) && car.isRented()) {
                car.returnCar();
                System.out.println("还车成功！");
                return;
            }
        }
        System.out.println("没有找到已租走的汽车");
    }
}