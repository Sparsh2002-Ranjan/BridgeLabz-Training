import java.util.*;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int realval = num;
        while (realval != 0) {
            int digit = realval % 10;
            sum = sum + (digit * digit * digit);
            realval = realval / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is Not an Armstrong Number");
        }
    }
}
