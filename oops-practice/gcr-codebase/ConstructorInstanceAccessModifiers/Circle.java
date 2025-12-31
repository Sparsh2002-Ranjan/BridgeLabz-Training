import java.util.*;

public class Circle {

    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Call parameterized constructor with default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [Radius=" + radius + "]";
    }
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Scanner sc = new Scanner(System.in);
        double dd = sc.nextDouble();
        Circle customCircle = new Circle(dd);
        System.out.println(defaultCircle); 
        System.out.println(customCircle);  
    }
}