package com.kodilla.exceptiontwo.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {

    public static boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Chicago", false);
        airports.put("Detroit", true);
        airports.put("Miami", false);
        airports.put("New York", true);
        airports.put("Seattle", true);

        /*
        boolean errorDeparture = true;
        boolean errorArrival = true;

        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
            if (flight.getArrivalAirport().equals(entry.getKey())) {
                errorArrival = false;
                if (entry.getValue()) {landing = true;}
            }
            if (flight.getDepartureAirport().equals(entry.getKey())) {errorDeparture = false;}
        }

        if (!errorArrival) {
            if (!errorDeparture) {
                if(landing) {
                    System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " checked and verified.");
                    return true;
                } else {
                    System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " checked but arrival at the chosen airport is unavailable.");
                    return false;
                }
            } else {
                throw new RouteNotFoundException("Departure airport incorrect.");
            }
        } else {
            throw new RouteNotFoundException("Arrival airport incorrect.");
        }
        */

        if (airports.containsKey(flight.getArrivalAirport())) {
            if (airports.get(flight.getArrivalAirport())) {
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " checked and verified.");
                return true;
            } else {
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " checked but arrival at the chosen airport is unavailable.");
                return false;
            }
        } else {
            throw new RouteNotFoundException("Arrival airport incorrect.");
        }
    }

    public static void main(String[] args) {
        Flight lot = new Flight("San Francisco", "Boston");
        boolean lotMozliwy;

        try {
            lotMozliwy = findFlight(lot);
            if(lotMozliwy) {System.out.println("Milego lotu.");}
        } catch (RouteNotFoundException e) {
            System.out.println(e);
            System.out.println("Destination airport does NOT exist.");
        } finally {
            System.out.println("Daje cos w finally, aby nie bylo, ze nic nie dalem.");
        }
    }
}
