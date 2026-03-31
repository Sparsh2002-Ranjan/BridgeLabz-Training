import java.util.*;

public class LimitedMutiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=(i+6)*num;
        }
        for(int i=0;i<4;i++){
            System.out.println(num+"*"+(i+6)+"="+arr[i]);
        }
    }    
}
