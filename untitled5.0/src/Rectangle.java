// Rectangle 类
class Rectangle extends Shape {
    private double width;    //被private的变量只能在当前类中使用
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        calculateArea();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        calculateArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateArea();
    }

    public void calculateArea() {
        this.area = width * height;
    }
}