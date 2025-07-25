// Triangle 类
class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calculateArea();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        calculateArea();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        calculateArea();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        calculateArea();
    }

    public void calculateArea() {
        double s = (a + b + c) / 2;
        this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
