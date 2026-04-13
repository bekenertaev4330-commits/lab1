import java.util.*;

class Order {
    String name;
    double price;

    Order(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Task20 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Phone", 500),
                new Order("Book", 20),
                new Order("Laptop", 1000)
        );

        double total = orders.stream()
                .map(o -> o.price)
                .reduce(0.0, Double::sum);

        System.out.println("Total: " + total);
    }
}