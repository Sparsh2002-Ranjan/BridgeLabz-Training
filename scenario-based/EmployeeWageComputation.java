import java.util.*;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        int wage=0;
        System.out.println("0->Absent || 1->FullTime || 2->PartTime");
        System.out.print("[");
        for(int i=0;i<20;i++){
            arr[i]=(int)(Math.random()*3);
            System.out.print(arr[i]+" ");
            switch(arr[i]){
                case 0:
                    wage=wage+0;
                    break;
                case 1:
                    wage=wage+(20*8);
                    break;
                case 2:
                    wage=wage+(4*20);
                    break;
            }
        }
        System.out.println("]");
        System.out.println("Wage is "+wage);
    }
}
