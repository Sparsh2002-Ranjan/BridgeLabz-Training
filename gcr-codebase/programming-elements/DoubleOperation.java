import java.util.*;
public class DoubleOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=a+b*c;
        double e=a*b+c;
        double f=c+a/b;
        double g=a%b+c;
        System.out.println("a+b*c="+d);
        System.out.println("a*b+c="+e);
        System.out.println("c+a/b="+f);
        System.out.println("a%b+c="+g);
    }
}
