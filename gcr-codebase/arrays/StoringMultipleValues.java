import java.util.*;

public class StoringMultipleValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int i=0;
        int sum=0;
        System.out.println("Enter 10 numbers or write 0 or a negitive number to break the loop");
        while(i<10){
            int a=sc.nextInt();
            if(a<1)break;
            arr[i]=a;
            sum=sum+a;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("sum is "+sum);

    }    
}
