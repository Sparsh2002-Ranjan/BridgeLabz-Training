import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = temperature -> temperature > 40;

        alert.test(35.0);
        alert.test(45.0);
    }
}
