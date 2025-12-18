import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the len of the rectangle: ");
        double len = sc.nextDouble();
        System.out.print("Enter the bd of the rectangle: ");
        double bd = sc.nextDouble();
        double peri = 2 * (len + bd);
        System.out.println(peri);
    }
}
