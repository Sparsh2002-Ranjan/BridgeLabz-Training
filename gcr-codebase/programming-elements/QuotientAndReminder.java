import java.util.*;
public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int divid=sc.nextInt();
        int divisor=sc.nextInt();
        int quo=divid/divisor;
        int rem=divid%divisor;
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);
    }
}
