import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Enter a number greater than 0.");
            return;
        }
        int maxFact = 10;
        int[] factors = new int[maxFact];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (idx == maxFact) {
                    maxFact *= 2;
                    int[] temp = new int[maxFact];
                    for (int j = 0; j < idx; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[idx++] = i;
            }
        }
        System.out.print("Factors of " + num + " are: ");
        for (int i = 0; i < idx; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}