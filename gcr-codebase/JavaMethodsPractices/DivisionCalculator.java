import java.util.*;
public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        System.out.print("Enter the divisor ");
        int divisor = sc.nextInt();
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(num, divisor);
            System.out.println("Quotient " + result[0]);
            System.out.println("Remainder " + result[1]);
        }
    }
    public static int[] findRemainderAndQuotient(int num, int divisor) {
        int quotient = num / divisor;
        int remainder = num % divisor;
        return new int[] { quotient, remainder };
    }
}
