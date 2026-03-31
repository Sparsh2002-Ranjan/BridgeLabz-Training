import java.util.*;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number");
        int num = sc.nextInt();
        if (num>0) {
            System.out.println("Factors of " + num + " are ");
            int i=1;
            while (i<=num) {
                if (num%i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Not a positive number");
        }
    }
}
