import java.util.Scanner;

public class ClassRectangle {
    static Scanner sc = new Scanner(System.in);
    public class Rectangle {
        private double width;
        private double height;

        public Rectangle() {
            this.width = 1;
            this.height = 1;
        }
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }
        public double getHeight() {
            return height;
        }
        public void setWidth(double width) {
            if (width > 0) {
                this.width = width;
            }
        }
        public void setHeight(double height) {
            if (height > 0) {
                this.height = height;
            }
        }

        public double area() {
            return width * height;
        }
        public double perimeter() {
            return (width + height) / 2;
        }
        public void input() {
            boolean check = true;
            double w = 0, h = 0;
            while (check) {
                System.out.println("Nhap chieu rong: ");
                w = sc.nextDouble();
                if (w > 0) {
                    check = false;
                }
            }
            check  = true;
            while (check) {
                System.out.println("Nhap chieu dai: ");
                h = sc.nextDouble();
                if (h > 0) {
                    check = false;
                }
            }
            Rectangle reg = new Rectangle(w, h);
        }
        public void output() {
            System.out.println("Chieu rong: " + this.width);
            System.out.println("Chieu dai: " + this.height);
        }
    }

    public static void main(String[] args) {
        ClassRectangle cr = new ClassRectangle();
        Rectangle regtangle1 = cr.new Rectangle();
        regtangle1.output();
        System.out.println();
        Rectangle regtangle2 = cr.new Rectangle();
        regtangle2.output();
    }
}
