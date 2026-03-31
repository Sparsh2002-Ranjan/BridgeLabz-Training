import java.util.*;
public class Maximumnumberofhandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfPeople=sc.nextInt();
        int result=(numberOfPeople*(numberOfPeople-1))/2;
        System.out.println(result);
    }
}
