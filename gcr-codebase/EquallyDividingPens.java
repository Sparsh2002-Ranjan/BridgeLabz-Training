import java.util.*;
public class EquallyDividingPens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pens=sc.nextInt();
        int students=sc.nextInt();
        System.out.println("numbers of pens each student will get is "+(pens/students));
        System.out.println("Remainig pens are "+(pens%students));
    }
}
