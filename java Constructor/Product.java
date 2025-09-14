class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
