abstract class GoodTransport{
    private String transportid;
    private String transportDate;
    private int transportRating;
    
    public GoodTransport(String transportid, String transportDate, int transportRating){
        this.transportid = transportid;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportID(){
        return transportid;
    }
    public String getTransportDate(){
        return transportDate;
    }
    public int getTransportRating(){
        return transportRating;
    } 

    abstract public String vehicleSelection();
    abstract public float calculateTotalCharge();
}