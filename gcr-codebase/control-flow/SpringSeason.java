import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        if(month==3 && day>=20 && day<=31)System.out.println("Spring Season");
        else if(month==4 && day>=1 && day<=30)System.out.println("Spring Season");
        else if(month==5 && day>=1 && day<=31)System.out.println("Spring Season");
        else if(month==6 && day>=1 && day<=20)System.out.println("Spring Season");
        else System.out.println("Not Spring Season");
    }
}
