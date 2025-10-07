class Vehicle {
    public void move() {};
}
class car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
}
public class ClassVehicle {
    public static void main(String[] args) {
//        ClassVehicle cv = new ClassVehicle();
        Vehicle newCar = new car();
        newCar.move();
    }
}