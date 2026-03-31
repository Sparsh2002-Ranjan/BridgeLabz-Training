
import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("Not Anagram");
            return;
        }
        int[] freq = new int[256];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }
        for(int x: freq){
            if(x!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
