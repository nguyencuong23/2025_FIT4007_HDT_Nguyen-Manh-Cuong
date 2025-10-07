public class ClassProduct {
    public class product {
        private int productID;
        private String name;
        private double unitPrice;
        private double discountPercent;

        public product(int productID, String name) {
            this.productID = productID;
            this.name = name;
        }
        public product(int productID, String name, double unitPrice, double discountPercent) {
            this.productID = productID;
            this.name = name;
            this.unitPrice = unitPrice;
            this.discountPercent = discountPercent;
        }

        public int getProductID() {
            return productID;
        }
        public void setProductID(int productID) {
            this.productID = productID;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getUnitPrice() {
            return unitPrice;
        }
        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }
        public double getDiscountPercent() {
            return discountPercent;
        }
        public void setDiscountPercent(double discountPercent) {
            this.discountPercent = discountPercent;
        }

        double getSalePrice() {
            return unitPrice * (1 - discountPercent/100);
        }
        void updatePrice(double newPrice) {
            this.unitPrice = newPrice;
        }
        void applyExtraDiscount(double morePercent){
            if (morePercent + this.discountPercent <= 100){
                this.discountPercent += morePercent;
            }
        }
    }
    public static void  main(String[] args) {
        ClassProduct cp = new ClassProduct();
        product product1 = cp.new product(1, "San pham 1", 1234, 20);
        System.out.println("Gia san pham 1: " + product1.getSalePrice());
        product1.applyExtraDiscount(10);
        product1.updatePrice(product1.getSalePrice());
        System.out.println("Gia san pham 1: " + product1.getSalePrice());
    }
}
