abstract class Shape {
    public abstract void getArea();
}
class Circle extends Shape {
    @Override
    public void getArea() {
        System.out.println("S = pi * r * r");
    }
}
class Rectangle extends Shape {
    @Override
    public void getArea() {
        System.out.println("S = w * h");
    }
}
public class ClassShape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.getArea();
        rectangle.getArea();
    }
}
