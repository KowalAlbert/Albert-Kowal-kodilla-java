package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class FlightsDataBase {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight (Flight flight) {
        flights.add(flight);
        System.out.println("Flight added.");
    }

    public void removeFlight (Flight flight) {
        if (flights.contains(flight)) {
            flights.remove(flight);
            System.out.println("Flight removed.");
        } else {
            System.out.println("Flight not found.");
        }
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
