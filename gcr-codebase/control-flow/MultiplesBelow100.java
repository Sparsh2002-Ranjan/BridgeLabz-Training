import java.util.*;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0 && num<100) {
            System.out.println("Multiples of " + num + " below 100 are ");
            for (int i=100;i>=1;i--) {
                if (i%num == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
