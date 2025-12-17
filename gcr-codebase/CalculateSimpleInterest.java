import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the p amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the r of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the t period: ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println(si);
    }
}
