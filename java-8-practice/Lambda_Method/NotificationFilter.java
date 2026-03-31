
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    Alert(String type) {
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = List.of(
            new Alert("Emergency"),
            new Alert("Appointment"),
            new Alert("Promotion")
        );

        Predicate<Alert> important = a -> a.type.equals("Emergency");
        alerts.stream().filter(important).forEach(a -> System.out.println(a.type));
    }
}
