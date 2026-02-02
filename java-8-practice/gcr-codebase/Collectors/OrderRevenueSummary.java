
import java.util.*;
import java.util.stream.*;

class Order {
    private String customer;
    private double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Rahul", 1200),
            new Order("Anita", 900),
            new Order("Rahul", 800)
        );

        Map<String, Double> revenue =
            orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getTotal)
            ));

        System.out.println(revenue);
    }
}
