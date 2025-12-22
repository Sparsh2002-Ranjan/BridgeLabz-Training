import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        boolean b=true;
        char[] ch=text1.toCharArray();
        ArrayList<Character> arr=new ArrayList<>();
        for(char c:text2.toCharArray()){
            arr.add(c);
        }
        for(char c:ch){
            if(arr.contains(c)){
                arr.remove((Character)c);
            }else{
                b=false;
                break;
            }
        }
        if(b && arr.size()==0){
            System.out.println("The texts are anagrams.");
        }else{
            System.out.println("The texts are not anagrams.");
        }
    }
}
