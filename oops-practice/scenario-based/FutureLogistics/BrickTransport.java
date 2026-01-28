public class BrickTransport extends GoodTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportid, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportid, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public float getBrickSize() {
        return brickSize;
    }
    public int getBrickQuantity() {
        return brickQuantity;
    }
    public float getBrickPrice() {
        return brickPrice;
    }

    @Override
    public String vehicleSelection() {
        int q = this.getBrickQuantity();
        if (q < 300) return "Truck";
        else if (q <= 500) return "Lorry";
        else return "Monster Lorry";
    }

    @Override
    public float calculateTotalCharge() {
        int rate = this.getTransportRating(); // use transport rating
        float price = this.getBrickQuantity() * this.getBrickPrice();
        float tax = price * 0.3f;
        float discount = 0;
        if (rate == 5) discount = price * 0.2f;
        else if (rate > 2) discount = price * 0.1f;

        String vehicle = vehicleSelection();
        if ("Truck".equals(vehicle)) return price + tax - discount + 1000;
        else if ("Lorry".equals(vehicle)) return price + tax - discount + 1700;
        else return price + tax - discount + 3000;
    }
}
