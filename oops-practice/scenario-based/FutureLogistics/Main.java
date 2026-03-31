import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransportUtility utility = new TransportUtility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodTransport transport = utility.parseDetails(input);
        if (transport == null) return;

        String type = utility.findObjectType(transport);
        float totalCharge = transport.calculateTotalCharge();

        System.out.println("\nTransporter id : " + transport.getTransportID());
        System.out.println("Date of transport : " + transport.getTransportDate());
        System.out.println("Rating of the transport : " + transport.getTransportRating());

        if (type.equals("BrickTransport")) {
            BrickTransport brick = (BrickTransport) transport;
            System.out.println("Quantity of bricks : " + brick.getBrickQuantity());
            System.out.println("Brick price : " + brick.getBrickPrice());
            System.out.println("Vehicle for transport : " + brick.vehicleSelection());
        } else if (type.equals("TimberTransport")) {
            TimberTransport timber = (TimberTransport) transport;
            System.out.println("Timber Length : " + timber.getTimberLength());
            System.out.println("Timber Radius : " + timber.getTimberRadius());
            System.out.println("Timber Type : " + timber.getTimberType());
            System.out.println("Timber Price : " + timber.getTimberPrice());
            System.out.println("Vehicle for transport : " + timber.vehicleSelection());
        }

        System.out.println("Total charge : " + totalCharge);
        sc.close();
    }
}
