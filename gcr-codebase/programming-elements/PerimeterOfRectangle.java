import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the bredth of the rectangle: ");
        double bredth = sc.nextDouble();
        double perimeter = 2 * (length + bredth);
        System.out.println(perimeter);
    }
}
