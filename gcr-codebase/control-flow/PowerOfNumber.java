import java.util.*;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        System.out.print("Enter power");
        int power=sc.nextInt();
        if (power>=0) {
            int result=1;
            for (int i=1;i<=power;i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);
        } else {
            System.out.println("Power must be a non-negative integer.");
        }
    }
}
