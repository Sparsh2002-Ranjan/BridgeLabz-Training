import java.util.*;
public class Itemtotalprice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int itemprice=sc.nextInt();
        int quantity=sc.nextInt();
        int total=itemprice*quantity;
        System.out.println(total);
    }
}
