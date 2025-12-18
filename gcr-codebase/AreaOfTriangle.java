import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double area=0.5*b*h;
        double inch=area/2.54;
        double feet=inch/12;
        System.out.println("your area in cm is this "+area+" in feet is this "+feet+" and in inches is this "+inch);    
    }
}