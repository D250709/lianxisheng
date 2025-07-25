import java.util.*;
public class ShapeManager {
        private List<Shape> shapes = new ArrayList<>();

        public void addShape(Shape shape) {
            shapes.add(shape);
        }

        public void removeShape(Shape shape) {
            shapes.remove(shape);
        }

        public void display() {
            for (Shape shape : shapes) {
                System.out.println("Shape: " + shape.getClass().getSimpleName() + ", Area: " + shape.getArea());
            }
        }
    }


