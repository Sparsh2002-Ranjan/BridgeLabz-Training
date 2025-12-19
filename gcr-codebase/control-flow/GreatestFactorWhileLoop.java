import java.util.*;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int greatestFactor = 1;
        if (num>1) {
            int count=num-1;
            while (count>=1) {
                if (num%count == 0) {
                    greatestFactor = count;
                    break;
                }
                count--;
            }
            System.out.println("Greatest factor is " + greatestFactor);
        } else {
            System.out.println("No proper factors for number " + num);
        }
    }
}
