import java.util.*;
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("Profit of INR"+(sp-cp));
            System.out.println("Profit percentage is "+((sp-cp)*100)/cp+"%");
        }
        else if(cp>sp){
            System.out.println("Loss of INR"+(cp-sp));
            System.out.println("Loss percentage is "+((cp-sp)*100)/cp+"%");
        }
        else{
            System.out.println("No Profit No Loss so the profit or loss percentage is 0%");
        }
    }
}
