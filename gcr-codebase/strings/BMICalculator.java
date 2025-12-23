import java.util.*;

public class BMICalculator {

    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Height\tWeight\tBMI\tStatus");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            double heightCm = sc.nextDouble();

            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);

            System.out.println(
                heightCm + "\t" +
                weight + "\t" +
                String.format("%.2f", bmi) + "\t" +
                getStatus(bmi)
            );
        }
    }
}
