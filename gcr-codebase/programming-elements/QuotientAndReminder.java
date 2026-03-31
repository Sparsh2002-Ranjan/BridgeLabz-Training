import java.util.*;
public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int divident=sc.nextInt();
        int divisor=sc.nextInt();
        int quo=divident/divisor;
        int reminder=divident%divisor;
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+reminder);
    }
}
