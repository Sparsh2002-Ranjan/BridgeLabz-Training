import java.util.*;
public class EarthVolume {
    public static void main(String[] args) {
        double rad=6378;
        double vol=(4/3)*Math.PI*Math.pow(rad, 3);
        System.out.println("Volume of the Earth is "+ vol +" cubic kilometers");
        System.out.println("Volume of the Earth is "+ vol*1.6 +" cubic miles");
        
    }
}
