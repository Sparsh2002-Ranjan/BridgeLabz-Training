// import java.util.*;

public class CreatorStats{
    private String CreatorName;
    private double[] WeeaklyLikes;

    public CreatorStats(String CreatorName,double[] WeeaklyLikes){
        this.CreatorName=CreatorName;
        this.WeeaklyLikes=WeeaklyLikes;
    }
    public String getCreatorName(){
        return CreatorName;
    }
    public double[] getWeeaklyLikes(){
        return WeeaklyLikes;
    }
    
    // @Override
    // public String toString(){
    //     return "CreatorName = "+CreatorName+"\n"+
    //             ",WeeaklyLikes = "+ Arrays.toString(WeeaklyLikes);
    // }
}
