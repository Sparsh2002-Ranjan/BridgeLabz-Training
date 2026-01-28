import java.util.regex.Pattern;

public class TransportUtility {

    // -------------------------------
    // Parse details and return GoodTransport object
    // -------------------------------
    public GoodTransport parseDetails(String input) {
        String[] parts = input.split(":");  // Colon separated

        if (parts.length < 7) {
            System.out.println("Invalid input format");
            return null;
        }

        String transportId = parts[0].trim();
        String transportDate = parts[1].trim();
        int transportRating = Integer.parseInt(parts[2].trim());
        String transportType = parts[3].trim();

        if (!validateTransportId(transportId)) {
            System.out.println("Please provide a valid record");
            System.exit(0);
        }

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            float brickSize = Float.parseFloat(parts[4].trim());
            int brickQuantity = Integer.parseInt(parts[5].trim());
            float brickPrice = Float.parseFloat(parts[6].trim());

            return new BrickTransport(transportId, transportDate, transportRating,
                    brickSize, brickQuantity, brickPrice);

        } else if (transportType.equalsIgnoreCase("TimberTransport")) {
            // For TimberTransport input: RTS456B:12/8/21:4:TimberTransport:10:2:Premium:500
            if (parts.length < 8) {
                System.out.println("Invalid input format for TimberTransport");
                return null;
            }
            float timberLength = Float.parseFloat(parts[4].trim());
            float timberRadius = Float.parseFloat(parts[5].trim());
            String timberType = parts[6].trim();
            float timberPrice = Float.parseFloat(parts[7].trim());

            return new TimberTransport(transportId, transportDate, transportRating,
                    timberLength, timberRadius, timberType, timberPrice);
        } else {
            System.out.println("Unknown transport type: " + transportType);
            return null;
        }
    }

    // -------------------------------
    // Validate transportId
    // -------------------------------
    public boolean validateTransportId(String transportId) {
        String pattern = "RTS[0-9]{3}[A-Z]";
        if (Pattern.matches(pattern, transportId)) {
            return true;
        } else {
            System.out.println("Transport Id " + transportId + " is invalid");
            return false;
        }
    }

    // -------------------------------
    // Identify the type of GoodTransport object
    // -------------------------------
    public String findObjectType(GoodTransport goodsTransport) {
        if (goodsTransport instanceof BrickTransport) {
            return "BrickTransport";
        } else if (goodsTransport instanceof TimberTransport) {
            return "TimberTransport";
        } else {
            return "UnknownTransportType";
        }
    }
}
