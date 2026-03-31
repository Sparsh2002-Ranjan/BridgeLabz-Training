import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        char type = sc.next().charAt(0);
        if (type == 'C')
            System.out.println(convertToFahrenheit(value));
        else
            System.out.println(convertToCelsius(value));
    }
    static double convertToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    static double convertToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
