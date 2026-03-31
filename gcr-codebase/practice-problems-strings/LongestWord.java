
import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String max = "";
        for(String w: arr){
            if(w.length() > max.length())
                max = w;
        }
        System.out.println(max);
    }
}
