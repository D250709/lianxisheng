//定义抽象类
public abstract class Geometric {
    private String color;
    private boolean filled;

//定义无参构造方法color（white），filled（false）
    public Geometric() {
        this.color = "white";
        this.filled = false;
    }

    // 定义带参数的构造方法，用于指定颜色和填充状态
    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //获取颜色方法
    public String getColor() {
        return color;
    }

    //定义颜色方法
    public void setColor(String color) {
        this.color = color;
    }

    //获取填充方法
    public boolean isFilled() {
        return filled;
    }

    //定义填充方法
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // 抽象方法计算面积
    public abstract double getArea();

    // 抽象方法计算周长
    public abstract double getPerimeter();

    // toString 方法，返回图形的描述
    public String toString() {
        return "Geometric [颜色=" + color + ", 填充=" + filled + "]";
    }
}

