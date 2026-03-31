import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();
            if (height[i] <= 0 || weight[i] <= 0) {
                System.out.println("Invalid input.");
                i--;
                continue;
            }
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerso " + (i + 1) + ":");
            System.out.println("Height " + height[i] + " m");
            System.out.println("Weight " + weight[i] + " kg");
            System.out.println("BMI " + bmi[i]);
            System.out.println("Status " + status[i]);
        }
    }
}
