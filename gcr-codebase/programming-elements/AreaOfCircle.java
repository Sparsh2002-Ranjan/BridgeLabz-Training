import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rad of the circle: ");
        double rad = sc.nextDouble();
        double ar = Math.PI * rad * rad;
        System.out.println(ar);
        
    }
}
