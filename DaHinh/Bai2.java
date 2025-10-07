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
        System.out.println("S = h * w");
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.getArea();
        Circle c = (Circle) s;
        c.getArea();
    }
}