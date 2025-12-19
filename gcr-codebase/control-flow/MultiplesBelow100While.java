import java.util.*;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0 && num<100) {
            System.out.println("Multiples of " + num + " below 100 are ");
            int count=100;
            while (count>=1) {
                if (count%num == 0) {
                    System.out.println(count);
                }
                count--;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
