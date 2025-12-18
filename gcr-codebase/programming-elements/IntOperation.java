import java.util.*;
public class IntOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b*c;
        int e=a*b+c;
        int f=c+a/b;
        int g=a%b+c;
        System.out.println("a+b*c="+d);
        System.out.println("a*b+c="+e);
        System.out.println("c+a/b="+f);
        System.out.println("a%b+c="+g);
    }
}
