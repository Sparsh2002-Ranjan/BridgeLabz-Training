import java.util.*;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose the coffee and write the number of the coffee you want to order:");
        System.out.println("1. Cold Coffee - Rs70");
        System.out.println("2. Cappuccino - Rs85");
        System.out.println("3. Latte - Rs90");
        System.out.println("4. Mocha - Rs80");
        System.out.println("5. Espresso - Rs75");
        System.out.println("6. Exit");
        int choice=sc.nextInt();
        int price=0;
        System.out.println("Enter quantity");
        int quantity=sc.nextInt();
        switch (choice) {
            case 1:
                price=70*quantity;
                System.out.println("Your total bill is Rs "+price);
                break;
            case 2:
                price=85*quantity;
                System.out.println("Your total bill is Rs "+price);
                break;
            case 3:
                price=90*quantity;
                System.out.println("Your total bill is Rs "+price);
                break;
            case 4:
                price=80*quantity;
                System.out.println("Your total bill is Rs "+price);
                break;
            case 5:
                price=75*quantity;  
                System.out.println("Your total bill is Rs "+price);
                break;
            default:
                break;
        }
        System.out.println("Thank you for visiting!");
    }
}
