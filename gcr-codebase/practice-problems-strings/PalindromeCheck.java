
import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for(int i=s.length()-1;i>=0;i--){
            r += s.charAt(i);
        }
        if(s.equals(r))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
