public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not Assigned";
        this.rentalDays = 0;
        this.ratePerDay = 1000;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.ratePerDay = 1000;
    }

    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }
}
