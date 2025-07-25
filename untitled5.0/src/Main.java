public class Main {
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();

        // 创建各种图形对象
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3, 4, 5);

        // 添加到图形管理器
        manager.addShape(rectangle);
        manager.addShape(circle);
        manager.addShape(triangle);

        // 显示所有图形
        manager.display();
    }
}