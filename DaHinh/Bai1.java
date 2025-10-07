import java.util.List;
import java.util.ArrayList;

abstract class Employee {
    public abstract void calculateSalary();
}
class FullTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Tinh luong cho nhan vien fulltime");
    }
}
class PartTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Tinh luong cho nhan vien partime");
    }
}
public class Bai1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee());
        employees.add(new PartTimeEmployee());
        for (Employee e : employees) {
            e.calculateSalary();
        }
    }
}