import java.util.*;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter power");
        int power = sc.nextInt();
        if (power >= 0) {
            int result = 1;
            int count = 0;
            while (count < power) {
                result *= num;
                count++;
            }
            System.out.println(num + " raised to the power " + power + " is " + result);
        } else {
            System.out.println("Power must be a non-negative integer.");
        }
    }
}