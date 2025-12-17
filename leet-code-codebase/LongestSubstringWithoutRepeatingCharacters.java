//leetcode question number 3

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)))break;
            else{
                set.add(s.charAt(i));
                a++;
            }
        }
        System.out.println(a);
    }
}
