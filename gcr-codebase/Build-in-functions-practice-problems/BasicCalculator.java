import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        if (op == '+') System.out.println(add(a, b));
        else if (op == '-') System.out.println(subtract(a, b));
        else if (op == '*') System.out.println(multiply(a, b));
        else System.out.println(divide(a, b));
    }
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
}
