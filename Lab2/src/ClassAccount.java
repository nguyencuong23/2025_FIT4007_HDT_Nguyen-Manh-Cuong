public class ClassAccount {
    public class Account {
        private int id;
        private double balance;

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        int getId() {
            return id;
        }
        double getBalance() {
            return balance;
        }

        void setId(int id) {
            this.id = id;
        }
        void setBalance(double balance) {
            this.balance = balance;
        }

        void printInformation() {
            System.out.println("Ma so tai khoan: " + id);
            System.out.println("So tien: " + balance);
        }
    }
    public static void main(String[] args) {
        ClassAccount acc = new ClassAccount();
        Account account1 = acc.new Account(1, 100000);

        System.out.println("Thong tin tai khoan hien tai");
        account1.printInformation();

        account1.setBalance(80000);
        System.out.println("Thong tin tai khoan sau khi cap nhat");
        account1.printInformation();
    }
}
