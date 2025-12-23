import java.util.*;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    static long factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }
}
