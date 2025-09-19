import java.time.Year;

public class ClassStudent {
    public class Student {
        private int id;
        private String name;
        private int birthYear;
        private String address;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public Student(int id, String name, int birthYear, String address) {
            this.id = id;
            this.name = name;
            this.birthYear = birthYear;
            this.address = address;
        }

        void setId(int id) {
            this.id = id;
        }
        void setName(String name) {
            this.name = name;
        }
        void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }
        void setAddress(String address) {
            this.address = address;
        }
        int getId() {
            return id;
        }
        String getName() {
            return name;
        }
        int getBirthYear() {
            return birthYear;
        }
        String getAddress() {
            return address;
        }

        void printInformation() {
            System.out.println("Ma sinh vien: " + id);
            System.out.println("Ho ten: " + name);
            System.out.println("Nam sinh: " + birthYear);
            System.out.println("Dia chi: " + address);
        }

        int currentYear =  Year.now().getValue();
        void printAge() {
            System.out.println("Tuoi cua sinh vien: " + (currentYear - birthYear));
        }
    }
    public static void main(String[] args) {
        ClassStudent stu = new ClassStudent();
        Student student1 = stu.new Student(1, "Nguyen Van A", 2006, "Ha Noi");
        System.out.println("Thong tin sinh vien");
        student1.printInformation();
        student1.printAge();
    }
}
