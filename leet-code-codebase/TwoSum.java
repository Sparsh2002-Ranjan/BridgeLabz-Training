//leetcode question number 1

import java.util.*;

public class TwoSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0;
        int b=0;
        int c=0;
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    a=i;
                    b=j;
                    break;
                }
            }
        }
        System.out.print("["+a+","+b+"]");
    } 
}