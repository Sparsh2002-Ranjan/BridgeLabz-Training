import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter any number and type 0 or any negative number to stop the loop ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            total += num;
        }
        System.out.println("Total is " + total);
    }
}
