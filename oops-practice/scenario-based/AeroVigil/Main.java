package com.aerovigil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightUtil util = new FlightUtil();

        System.out.println("Enter flight details");
        String input = sc.nextLine();
        String[] parts = input.split(":");

        if (parts.length != 4) {
            System.out.println("Invalid input format. Expected <FlightNumber>:<FlightName>:<PassengerCount>:<CurrentFuelLevel>");
            return;
        }

        String flightNumber = parts[0];
        String flightName = parts[1];
        int passengerCount;
        double currentFuel;

        try {
            passengerCount = Integer.parseInt(parts[2]);
            currentFuel = Double.parseDouble(parts[3]);
        } catch (NumberFormatException e) {
            System.out.println("Passenger count and fuel level must be numeric.");
            return;
        }

        try {
            util.validateFlightNumber(flightNumber);
            util.validateFlightName(flightName);
            util.validatePassengerCount(passengerCount, flightName);
            double fuelNeeded = util.calculateFuelToFillTank(flightName, currentFuel);
            System.out.println("Fuel required to fill the tank: " + fuelNeeded + " liters");
        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
    }
}
