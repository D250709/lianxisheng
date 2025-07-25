//定义一个圆形子类（Circle）
 abstract class Circle extends Geometric{
    private double radius;

    //无参构造方法圆的默认半径为1.0
public Circle(){
    this.radius = 1.0;
}

//有参构造方法指定圆的半径
public Circle(double radius){
    this.radius = radius;
}

//获取圆半径的方法
public double getRadius(){
    return radius;
}


    // 设置半径的方法
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 实现抽象方法 getArea()，返回圆的面积
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 实现抽象方法 getPerimeter()，返回圆的周长
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //toString() 方法，返回圆的字符串描述
    public String toString() {
        return "【圆】 [0半径=" + radius + ", 颜色=" + getColor() + ", 填充=" + isFilled() + "]";
    }
}
