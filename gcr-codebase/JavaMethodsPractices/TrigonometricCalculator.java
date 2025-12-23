import java.util.*;
public class TrigonometricCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine of "+ angle+" is "+ results[0]);
        System.out.println("Cosine of "+ angle+" is "+ results[1]);
        System.out.println("Tangent of "+ angle+" is "+ results[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] { sin, cos, tan };
    }
}
