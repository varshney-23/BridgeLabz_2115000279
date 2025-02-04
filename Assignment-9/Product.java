public class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 1000.00, 5);
        Product product2 = new Product(102, "Smartphone", 800.00, 10);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        updateDiscount(15.0);
        System.out.println("\nUpdated Discount: " + discount + "%");
    }
}
