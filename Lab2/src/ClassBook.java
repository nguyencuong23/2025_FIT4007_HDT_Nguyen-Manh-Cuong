public class ClassBook {
    public class Book{
        private int id;
        private String name;
        private double price;
        private double discount;

        public Book(int id, String name) {
            this.id = id;
            this.name = name;
            this.price = 0;
            this.discount = 0;
        }

        public Book(int id, String name, double price, double discount) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.discount = discount;
        }

        int getId() {
            return id;
        }
        String getName() {
            return name;
        }
        double getPrice() {
            return price;
        }
        double getDiscount() {
            return discount;
        }

        void setId(int id) {
            this.id = id;
        }
        void setName(String name) {
            this.name = name;
        }
        void setPrice(double price) {
            this.price = price;
        }
        void setDiscount(double discount) {
            this.discount = discount;
        }

        double calculateSellingPrice() {
            return price * (1 - discount/100);
        }
        void printSellingPrice() {
            System.out.println("Gia ban cua sach: " + calculateSellingPrice());
        }
        void printInformation() {
            System.out.println("Ma so sach: " + id);
            System.out.println("Ten sach: " + name);
            System.out.println("Gia sach: " + price);
            System.out.println("Giam gia: " + discount);
        }
    }

    public static void main(String[] args) {
        ClassBook b = new ClassBook();
        Book b1 = b.new Book(1, "Java", 100000.0, 20.0);
        System.out.println("Thong tin quyen sach hien tai:");
        b1.printInformation();
        b1.printSellingPrice();

        b1.setDiscount(30.0);
        System.out.println("Thong tin quyen sach sau khi cap nhat:");
        b1.printInformation();
        b1.printSellingPrice();
    }
}
