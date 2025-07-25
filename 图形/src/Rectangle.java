//定义一个矩形子类（Rectangle）
public abstract class Rectangle extends Geometric {
    private double side1;
    private double side2;

    //定义无参矩形创建方法
    public Rectangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
    }

    //定义有参指定矩形构造方法
    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    //获取矩形1条边参数的方法
    public double getSide1() {
        return side1;
    }
    //设置矩形1条边参数的方法
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // 实现抽象方法 getArea()，返回矩形的面积
    public double getArea() {
        return side1 * side2;
    }

    // 实现抽象方法 getPerimeter()，返回矩形的周长
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    //toString() 方法，返回矩形的字符串描述
    public String toString() {
        return "【矩形】 [边1=" + side1 + ", 边2=" + side2 + ", 颜色=" + getColor() + ", 填充=" + isFilled() + "]";
    }
}


