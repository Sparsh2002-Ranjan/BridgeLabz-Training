public class Temperature {
    public static void main(String[] args) {

        double fhrentocel = (100 - 32) * 5 / 9;
        double celtofren = (37 * 9 / 5) + 32;
        double  poundtokilo =  150 * 0.453592;
        double kilotopounds = 70 * 2.20462;
        double gallonstoliters = 5 * 3.78541;
        double literstogallons = 10 * 0.264172;
        System.out.println("100 Fahrenheit to Celsius: " + fhrentocel);
        System.out.println("37 Celsius to Fahrenheit: " + celtofren);
        System.out.println("150 Pounds to Kilograms: " + poundtokilo);
        System.out.println("70 Kilograms to Pounds: " + kilotopounds);
        System.out.println("5 Gallons to Liters: " + gallonstoliters);
        System.out.println("10 Liters to Gallons: " + literstogallons);
    }
}
