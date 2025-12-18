import java.util.*;
public class DistanceinYards {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int feet=sc.nextInt();
         int yard=feet/3;
         int miles=yard/1760;
         System.out.println("the distance in feet is "+feet+" and in yard is "+yard+" and in miles is "+miles);
    }
}
