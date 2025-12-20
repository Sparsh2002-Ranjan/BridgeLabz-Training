import java.util.*;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your height ");
        double height=sc.nextDouble();
        System.out.println("Enter your weight");
        double weight=sc.nextDouble();
        double BMI=weight/(height*height);
        if(BMI<18.5) {
            System.out.println("You are underweight");
        }
        else if(BMI>=18.5 && BMI<24.9) {
            System.out.println("Your weight is normal");
        }
        else if(BMI>=25) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
