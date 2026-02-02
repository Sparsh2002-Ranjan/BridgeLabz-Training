import java.util.*;
import java.util.stream.*;
import java.time.*;

interface GeoUtils {
    static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

interface TransportService {
    String getId();
    String getType();
    double getFare();
    LocalTime getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getType() + " | ID: " + getId() + " | Fare: " + getFare() + " | Departs: " + getDepartureTime());
    }

    static double calculateFare(double base, double distance) {
        return base * distance;
    }
}

class BusService implements TransportService {
    private final String id;
    private final double fare;
    private final LocalTime departure;

    BusService(String id, double fare, LocalTime departure) {
        this.id = id;
        this.fare = fare;
        this.departure = departure;
    }

    public String getId() { return id; }
    public String getType() { return "Bus"; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return departure; }
}

class MetroService implements TransportService {
    private final String id;
    private final double fare;
    private final LocalTime departure;

    MetroService(String id, double fare, LocalTime departure) {
        this.id = id;
        this.fare = fare;
        this.departure = departure;
    }

    public String getId() { return id; }
    public String getType() { return "Metro"; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return departure; }
}

class TaxiService implements TransportService {
    private final String id;
    private final double fare;
    private final LocalTime departure;

    TaxiService(String id, double fare, LocalTime departure) {
        this.id = id;
        this.fare = fare;
        this.departure = departure;
    }

    public String getId() { return id; }
    public String getType() { return "Taxi"; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return departure; }
}

class PassengerTrip {
    final String serviceType;
    final double amount;

    PassengerTrip(String serviceType, double amount) {
        this.serviceType = serviceType;
        this.amount = amount;
    }
}

public class SmartCityApp {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
                new BusService("B101", 20.0, LocalTime.of(9, 15)),
                new MetroService("M501", 30.0, LocalTime.of(8, 45)),
                new TaxiService("T301", 50.0, LocalTime.of(9, 5)),
                new BusService("B102", 18.0, LocalTime.of(10, 0))
        );

        services.stream()
                .sorted(Comparator.comparing(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        System.out.println();

        services.stream()
                .filter(s -> s.getFare() <= 25)
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        double distance = GeoUtils.calculateDistance(2, 3, 7, 9);
        double calculatedFare = TransportService.calculateFare(5, distance);
        System.out.println("\nCalculated Fare: " + calculatedFare);

        List<PassengerTrip> trips = Arrays.asList(
                new PassengerTrip("Bus", 20),
                new PassengerTrip("Bus", 18),
                new PassengerTrip("Metro", 30),
                new PassengerTrip("Taxi", 50),
                new PassengerTrip("Taxi", 55)
        );

        Map<String, Double> revenueByService =
                trips.stream().collect(
                        Collectors.groupingBy(
                                t -> t.serviceType,
                                Collectors.summingDouble(t -> t.amount)
                        )
                );

        System.out.println("\nRevenue Report");
        revenueByService.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
