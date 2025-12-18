import java.util.*;
public class UniversityFeeDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discount=sc.nextInt();
        double diskamt=(fee*discount)/100;
        double payamt=fee-diskamt;
        System.out.println("discounted amount is "+diskamt);
        System.out.println("new amount to pay after discount is "+payamt);
    }
}
