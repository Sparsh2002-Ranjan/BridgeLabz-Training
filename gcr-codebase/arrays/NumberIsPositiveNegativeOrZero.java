import java.util.*;

public class NumberIsPositiveNegativeOrZero {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("------------------------------------------------------");
        for(int i=0;i<5;i++){
            if(arr[i]==0){
                System.out.println(arr[i]);
                System.out.println("Number is Zero");
            }else if(arr[i]>0){
                System.out.println(arr[i]);
                System.out.print("The number is positive");
                if(arr[i]%2==0){
                    System.out.println(" and The number is even");
                }else{
                    System.out.println(" and The number is odd");
                }
            }else{
                System.out.println(arr[i]);
                System.out.println("The number is negative");
            }
            System.out.println("------------------------------------------------------");
        }
        if(arr[0]==arr[arr.length-1]){
            System.out.println("The first and last elements are equal");
        }else if(arr[0]>arr[arr.length-1]){
            System.out.println("The first element is greater than the last element");
        }else{
            System.out.println("The last element is greater than the first element");   
        }
        System.out.println("------------------------------------------------------");
    }
}
