import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p);
            total += p.getPrice();
        }
        System.out.println("Total Price: $" + total);
        System.out.println("-----------------------------");
    }
}
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrderHistory() {
        System.out.println(name + "'s Order History:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}
public class ECommercePlatform {
    public static void main(String[] args) {
   
        Product laptop = new Product("Laptop", 1050);
        Product phone = new Product("Smartphone", 1700);
        Product headset = new Product("Headset", 1500);

        Customer ayu = new Customer("ayushi");
        Customer pran = new Customer("pranjal");

        Order order1 = new Order(ayu);
        order1.addProduct(laptop);
        order1.addProduct(phone);
        ayu.placeOrder(order1);

        Order order2 = new Order(pran);
        order2.addProduct(headset);
        pran.placeOrder(order2);

        Order order3 = new Order(ayu);
        order3.addProduct(headset);
        order3.addProduct(phone);
        ayu.placeOrder(order3);

        ayu.showOrderHistory();
        pran.showOrderHistory();
    }
}