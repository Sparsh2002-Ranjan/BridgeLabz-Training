import java.util.*;

public class SumNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<1) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }
        int sum=0;
        for (int j=1; j<=n;j++) {
            sum+= j;
        }
        int formula = n*(n+1)/2;
        if (sum == formula) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}





