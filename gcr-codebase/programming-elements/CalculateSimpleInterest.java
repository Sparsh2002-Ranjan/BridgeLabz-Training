import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period: ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println(si);
    }
}
