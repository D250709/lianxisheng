public class Main {
    public static void main(String[] args) {
        // 创建一个半径为 5.0 的圆对象
        Circle circle = new Circle(5.0) {
        };
        // 设置颜色和填充状态
        circle.setColor("蓝色");
        circle.setFilled(true);
        // 打印圆的信息
        System.out.println(circle.toString());
        // 打印圆的面积和周长
        System.out.println("面积: " + circle.getArea());
        System.out.println("周长: " + circle.getPerimeter());

        // 创建一个边长为 4.0 和 5.0 的矩形对象
        Rectangle rectangle = new Rectangle(4.0, 5.0){};
        // 设置颜色和填充状态
        rectangle.setColor("紫色");
        rectangle.setFilled(true);
        // 打印矩形的信息
        System.out.println(rectangle.toString());
        // 打印矩形的面积和周长
        System.out.println("面积: " + rectangle.getArea());
        System.out.println("周长: " + rectangle.getPerimeter());

        //创建一个边长为 3.0 4.0 5.0的三角形对象
        Triangle triangle = new Triangle(3.0,4.0,5.0) {
        };
        // 设置颜色和填充状态
        triangle.setColor("橙色");
        triangle.setFilled(true);
        // 打印三角形的信息
        System.out.println(triangle.toString());
        // 打印三角形的面积和周长
        System.out.println("面积: " + triangle.getArea());
        System.out.println("周长: " + triangle.getPerimeter());
    }
}