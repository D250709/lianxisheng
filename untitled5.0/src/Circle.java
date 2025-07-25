// Circle 类
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        calculateArea();
    }

    public void calculateArea() {
        this.area = Math.PI * radius * radius;
    }
}