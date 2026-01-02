import java.util.*;
public class Frequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[26];
        String st=sc.nextLine();
        for(int i=0;i<st.length();i++){
            int a=st.charAt(i)-a;
            arr[i]=arr[i]+1;
        }
    
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                char ch=(char)(i+'a');
                System.out.println(ch+" "+arr[i]);
            }
        }
    }
}