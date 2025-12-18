import java.util.*;
public class UniversityFee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=125000;
        int discount=10;
        double diskamt=(fee*discount)/100;
        double payamt=fee-diskamt;
        System.out.println("discounted amount is "+diskamt);
        System.out.println("new amount to pay after discount is "+payamt);
    }
}
