//Leetcode question number 2

import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("Enter no. of nodes in first linkedlist");
        int n=sc.nextInt();
        int a=0;
        for(int i=0;i<n;i++){
            int z=sc.nextInt();
            list.add(z);
            a=a*10+z;
        }
        LinkedList<Integer> list2=new LinkedList<>();
        System.out.println("Enter no. of nodes in secound linkedlist");
        int b=0;
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            int y=sc.nextInt();
            list2.add(y);
            b=b*10+y;
        }
        System.out.println(a+b);

    }
}
