import java.util.*;
public class VolumeOfCylinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rad of the cylinder: ");
        double rad = sc.nextDouble();
        System.out.print("Enter the hgt of the cylinder: ");
        double hgt = sc.nextDouble();
        double vol = Math.PI * Math.pow(rad, 2) * hgt;
        System.out.println(vol);
    }
}