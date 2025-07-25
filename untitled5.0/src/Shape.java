abstract class Shape {     //抽象类不能被实例化只能被继承
        protected double area; //被protected修饰的成员对于本包和其子类可见

        public Shape() {
            this.area = 0;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public abstract void calculateArea();
    }


