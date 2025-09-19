import java.util.Scanner;

public class ClassCircle {
    private static Scanner sc = new Scanner(System.in);

    public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle() {
            this.radius = 1;
        }

        double getRadius() {
            return radius;
        }
        void setRadius(double radius) {
            this.radius = radius;
        }
        void Output() {
            System.out.println("Thong tin hinh tron: ");
            System.out.print("Ban kinh r: " + radius);
        }

        double pi = Math.PI;
        void calculateArea() {
            System.out.println("Dien tich hinh tron: " + (pi * Math.pow(radius, 2)));
        }
        void calculatePerimeter() {
            System.out.println("Chu vi hinh tron: " + (pi * radius * 2));
        }
    }
    Circle Input() {
        System.out.println("Nhap hinh tron:");
        System.out.print("Nhap ban kinh r: ");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }
    public static void main(String[] args) {
        ClassCircle c = new ClassCircle();
        Circle circle = c.new Circle();
        circle.Output();
        System.out.println();
        Circle circle2 = c.Input();
        circle2.Output();
        System.out.println();
        circle2.calculateArea();
        circle2.calculatePerimeter();
        sc.close();
    }
}
