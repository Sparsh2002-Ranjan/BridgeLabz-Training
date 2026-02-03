import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VesselUtil vess=new VesselUtil();
        System.out.println("Enter the number of vessels to be added");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter vessel details");

        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String[] str=s.split(":");
            String vesselId=str[0];
            String vesselName=str[1];
            double averageSpeed=Double.parseDouble(str[2]);
            String vesselType=str[3];
            Vessel v=new Vessel(vesselId, vesselName, averageSpeed, vesselType);
            vess.addVesselPerformance(v);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String vessId=sc.next();
        Vessel v=vess.getVesselById(vessId);
        if(v!=null){
            System.out.println(v.toString());
        }else{
            System.out.println("Vessel Id "+ vessId +" not found");
        }
        System.out.println("High performance vessels are");
        List<Vessel> highPerformance=vess.getHighPerformanceVessels();
        for(Vessel vv:highPerformance){
            System.out.println(vv.toString());
        }
    }
}
