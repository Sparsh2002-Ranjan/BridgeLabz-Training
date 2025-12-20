import java.util.*;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num = sc.nextDouble();
        while (num != 0) {
            total += num;
            System.out.print("Enter any number and type zero to stop the loop");
            num = sc.nextDouble();
        }
        System.out.println("Total is " + total);
    }
}
