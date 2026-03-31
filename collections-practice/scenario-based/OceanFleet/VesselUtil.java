import java.util.*;

public class VesselUtil {

    private ArrayList<Vessel> vesselList=new ArrayList<>();

    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId){
        for(Vessel v:vesselList){
            if(v.getVesselId().equals(vesselId)){
                return v;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels(){
        ArrayList<Vessel> list=new ArrayList<>();
        double speed=0.0;
        for(int i=0;i<vesselList.size();i++){
            if(vesselList.get(i).getAverageSpeed()>speed){
                speed=vesselList.get(i).getAverageSpeed();
            }
        }
        for(int i=0;i<vesselList.size();i++){
            if(vesselList.get(i).getAverageSpeed()==speed){
                list.add(vesselList.get(i));
            }
        }
        return list; 
    }


}
