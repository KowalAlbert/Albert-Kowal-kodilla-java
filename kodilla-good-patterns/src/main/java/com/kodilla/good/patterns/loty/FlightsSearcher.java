package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class FlightsSearcher {

    public List<Flight> searchDeparture (String departure, List<Flight> flights) {
        List<Flight> foundDeparture = flights.stream().filter(f -> f.getDeparture().equals(departure)).toList();
        return foundDeparture;
    }

    public List<Flight> searchArrival (String arrival, List<Flight> flights) {
        List<Flight> foundArrival = flights.stream().filter(f -> f.getArrival().equals(arrival)).toList();
        return foundArrival;
    }

    public List<String> findConnection (String departure, String arrival, List<Flight> flights) {
        List<String> connections = new ArrayList<>();
        List<Flight> departureList = searchDeparture(departure, flights);
        List<Flight> arrivalList = searchArrival(arrival, flights);
        for (Flight flightStart: departureList) {
            for (Flight flightEnd: arrivalList) {
                if (flightStart.getArrival().equals(flightEnd.getDeparture())) {
                    connections.add(flightStart.getDeparture() + " -> " + flightStart.getArrival() + " -> " + flightEnd.getArrival());
                }
            }
        }
        return connections;
    }
}
