import java.util.*;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the b number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the expo number: ");
        double expo = sc.nextDouble();
        double res = Math.pow(b, expo);
        System.out.println(res);
    }    
}
