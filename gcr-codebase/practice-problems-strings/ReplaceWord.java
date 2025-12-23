
import java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();
        String[] arr = sentence.split(" ");
        String res = "";
        for(String w: arr){
            if(w.equals(oldWord))
                res += newWord + " ";
            else
                res += w + " ";
        }
        System.out.println(res.trim());
    }
}
