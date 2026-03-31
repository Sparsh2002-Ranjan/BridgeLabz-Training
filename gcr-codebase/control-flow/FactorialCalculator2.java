import java.util.*;

public class FactorialCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        long factorial = 1;
        for (int i=1;i<=num;i++) {
            factorial=factorial*i;
        }
        System.out.println("The factorial of " + num + " is " + factorial);
    }
}
