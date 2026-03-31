
import java.time.*;
import java.util.*;

public class ForEachExamples {
    public static void main(String[] args) {

        List<Double> stockPrices = List.of(120.5, 121.3, 119.8);
        stockPrices.forEach(System.out::println);

        List<String> attendees = List.of("Amit", "Sneha");
        attendees.forEach(a -> System.out.println("Welcome " + a));

        List<Integer> readings = List.of(20, 55, 70, 30);
        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);

        List<String> emails = List.of("a@test.com", "b@test.com");
        emails.forEach(e -> System.out.println("Email sent to " + e));

        List<String> transactions = List.of("TX101", "TX102");
        transactions.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
