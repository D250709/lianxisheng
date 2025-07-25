// 租赁类 Rental
public class Rental {
    // 属性
    private int rentalDays; // 租赁天数
    private Car car;        // 租赁的汽车对象
    private double totalRent; // 总租金

    // 构造方法
    public Rental(int rentalDays, Car car) {
        this.rentalDays = rentalDays;
        this.car = car;
        calculateTotalRent(); // 计算总租金
    }

    // 计算总租金
    private void calculateTotalRent() {
        totalRent = rentalDays * car.getDailyPrice();
    }

    // 获取租赁天数
    public int getRentalDays() {
        return rentalDays;
    }

    // 获取租赁的汽车
    public Car getCar() {
        return car;
    }

    // 获取总租金
    public double getTotalRent() {
        return totalRent;
    }
}