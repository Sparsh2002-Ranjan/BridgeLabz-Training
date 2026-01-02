import java.util.*;
public class SentenceFormater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(st.charAt(0)));
        for(int i=1;i<st.length();i++){
            if(st.charAt(i) == '.' || st.charAt(i) == '?' || st.charAt(i)=='!'){
                sb.append(st.charAt(i));
                sb.append(' ');
                i++;
                while(i<st.length() && st.length()>0 && st.charAt(i)==' '){
                    i++;
                }
                if(i<st.length()){
                    sb.append(Character.toUpperCase(st.charAt(i)));
                }
            }else if(st.charAt(i)==' '){
                sb.append(' ');
                while(i<st.length()-1 && st.charAt(i+1)==' '){
                    i++;
                }

            }else{
                sb.append(st.charAt(i));
              
        
            }
        }
        System.out.print(sb.toString());
    }
}