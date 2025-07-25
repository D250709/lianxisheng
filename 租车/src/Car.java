import java.util.ArrayList;
import java.util.List;
// 汽车类 Car
public class Car {
    // 属性
    private String brand;        // 汽车品牌
    private String model;        // 车型
    private String color;        // 颜色
    private double dailyPrice;   // 每日租金价格
    private boolean isRented;    // 是否被租走

    // 构造方法
    public Car(String brand, String model, String color, double dailyPrice) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.dailyPrice = dailyPrice;
        this.isRented = false; // 默认未被租走
    }

    public String getBrand() {
        return brand;
    }
    // 获取车型
    public String getModel() {
        return model;
    }

    // 获取颜色
    public String getColor() {
        return color;
    }

    // 获取每日租金
    public double getDailyPrice() {
        return dailyPrice;
    }

    // 检查汽车是否被租走
    public boolean isRented() {
        return isRented;
    }

    // 租赁该车
    public void rentCar() {
        isRented = true;
    }

    // 还车
    public void returnCar() {
        isRented = false;
    }

    // 重写 toString() 方法，返回汽车信息
    @Override
    public String toString() {
        return "Car [汽车品牌=" + brand + ", 型号=" + model + ", 颜色=" + color +
                ", 价格/天=" + dailyPrice + ", 租用状态=" + isRented + "]";
    }
}