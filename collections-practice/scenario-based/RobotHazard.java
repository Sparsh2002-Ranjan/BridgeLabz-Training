import java.util.*;

class RobotSafetyException extends Exception{
    public RobotSafetyException (String message){
        super(message);
    }
}

public class RobotHazard{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arm Precision between (0.0 to 1.0) -> ");
        double ap=sc.nextDouble();
        System.out.print("Enter Work Density between (1 to 20) -> ");
        int wd=sc.nextInt();
        System.out.print("Enter Machinery State (Worn or Faulty or Critical) -> ");
        String st=sc.next();
        try{
            double dd = CalculateHazardRisk(ap,wd,st);
            System.out.println("Robot Hazard Risk Score: " + dd);
        }catch(RobotSafetyException e){
            System.out.println(e.getMessage());
        }

    }

    public static double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{
        if(armPrecision<0.0 || armPrecision>1.0){
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }
        if(workerDensity<1 || workerDensity>20){
            throw new RobotSafetyException("Error:Worker density must be 1-20");
        }
        double machineRiskFactor = 0;
        if(machineryState.equals("Worn"))machineRiskFactor=1.3;
        else if(machineryState.equals("Faulty"))machineRiskFactor=2.0;
        else if(machineryState.equals("Critical"))machineRiskFactor=3.0;
        else{
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }
        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
    }
}