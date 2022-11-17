package com.kodilla.good.patterns.loty;

public class MainFlights {
    public static void main(String[] args) {

        FlightsDataBase flightsDataBase = new FlightsDataBase();
        FlightsSearcher flightsSearcher = new FlightsSearcher();

        flightsDataBase.addFlight(new Flight("Krakow", "Warszawa"));
        flightsDataBase.addFlight(new Flight("Wroclaw", "Warszawa"));
        flightsDataBase.addFlight(new Flight("Krakow", "Lublin"));
        flightsDataBase.addFlight(new Flight("Krakow", "Wroclaw"));
        flightsDataBase.addFlight(new Flight("Warszawa", "Lublin"));
        flightsDataBase.addFlight(new Flight("Wroclaw", "Krakow"));
        flightsDataBase.addFlight(new Flight("Warszawa", "Wroclaw"));
        flightsDataBase.addFlight(new Flight("Lublin", "Warszawa"));
        flightsDataBase.addFlight(new Flight("Lublin", "Wroclaw"));
        flightsDataBase.addFlight(new Flight("Warszawa", "Krakow"));

        System.out.println("Flights from Krakow: ");
        System.out.println(flightsSearcher.searchDeparture("Krakow", flightsDataBase.getFlights()));
        System.out.println("");

        System.out.println("Flights to Wroclaw: ");
        System.out.println(flightsSearcher.searchArrival("Wroclaw", flightsDataBase.getFlights()));
        System.out.println("");

        System.out.println("Connected flights from Krakow to Wroclaw: ");
        System.out.println(flightsSearcher.findConnection("Krakow", "Wroclaw", flightsDataBase.getFlights()));
        System.out.println("");
    }
}
