public class TimberTransport extends GoodTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportid, String transportDate, int transportRating,
                           float timberLength, float timberRadius, String timberType, float timberPrice) {
        super(transportid, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength() {
        return timberLength;
    }
    public float getTimberRadius() {
        return timberRadius;
    }
    public String getTimberType() {
        return timberType;
    }
    public float getTimberPrice() {
        return timberPrice;
    }

    @Override
    public String vehicleSelection() {
        double area = 2 * 3.147 * timberRadius * timberLength;
        if (area < 250) return "Truck";
        else if (area <= 400) return "Lorry";
        else return "Monster Lorry";
    }

    @Override
    public float calculateTotalCharge() {
        int rate = this.getTransportRating();
        float volume = (float) (3.147 * timberRadius * timberRadius * timberLength);
        float typeFactor = timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f;
        float price = volume * timberPrice * typeFactor;
        float tax = price * 0.3f;
        float discount = price * rate / 100;
        String vehicle = vehicleSelection();

        if ("Truck".equals(vehicle)) return price + tax + 1000 - discount;
        else if ("Lorry".equals(vehicle)) return price + tax + 1700 - discount;
        else return price + tax + 3000 - discount;
    }
}
