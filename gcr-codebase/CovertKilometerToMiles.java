import java.util.*;
public class CovertKilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double mil = km * 0.621371;
        System.out.println(mil);
    }
}
