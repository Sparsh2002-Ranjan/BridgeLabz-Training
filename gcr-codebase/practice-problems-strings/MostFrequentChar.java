
import java.util.*;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        char ans = s.charAt(0);
        for(int i=0;i<s.length();i++){
            int count = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            if(count > max){
                max = count;
                ans = s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
