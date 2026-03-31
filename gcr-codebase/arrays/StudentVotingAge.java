import java.util.*;

public class StudentVotingAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.print("Enter 10 student age");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]>=18)System.out.println("The student with the age " + arr[i] + " can vote");
            if(arr[i]<18)System.out.println("The student with the age " + arr[i] + " cannot vote");
        }

    }    
}
