import java.io.*;
import java.util.*;

public class SearchCSV {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;
        br.readLine();
        while((line=br.readLine())!=null){
            String[] data=line.split(",");
            if(data[1].equals("ss")){
                System.out.println("ID          -> " + data[0]);
               System.out.println("Name         -> " + data[1]);
               System.out.println("department   -> " + data[2]);
               System.out.println("Salary       -> " + data[3]);
            }
        }
        br.close();
    }
}