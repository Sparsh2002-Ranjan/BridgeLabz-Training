import java.util.*;

public class MaenHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[11];
        int sum=0;
        System.out.println("Enter 11 heights");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=sum/11;
        System.out.print(avg);
    }    
}
