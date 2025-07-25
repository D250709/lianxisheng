// 三角形类 Triangle 继承自 Geometric
public class Triangle extends Geometric {
    // 属性
    private double side1;
    private double side2;
    private double side3;

    // 无参构造方法，创建一个默认的三角形（边长为1.0）
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // 带参数的构造方法，用于指定三条边的长度
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // 获取 side1 的方法
    public double getSide1() {
        return side1;
    }

    // 设置 side1 的方法
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    // 获取 side2 的方法
    public double getSide2() {
        return side2;
    }

    // 设置 side2 的方法
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // 获取 side3 的方法
    public double getSide3() {
        return side3;
    }

    // 设置 side3 的方法
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // 判断三边是否能构成三角形
    public boolean isTriangle() {
        return (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);
    }

    // 实现抽象方法 getArea()，返回三角形的面积
    public double getArea() {
        if (!isTriangle()) {
            throw new IllegalArgumentException("无法构成三角形");
        }
        // 使用海伦公式计算面积
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // 实现抽象方法 getPerimeter()，返回三角形的周长
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // 重写 toString() 方法，返回三角形的字符串描述
    public String toString() {
        return "【三角形】 [边=" + side1 + ", 边2=" + side2 + ", 边3=" + side3 +
                ", 颜色=" + getColor() + ", 填充=" + isFilled() + "]";
    }
}
