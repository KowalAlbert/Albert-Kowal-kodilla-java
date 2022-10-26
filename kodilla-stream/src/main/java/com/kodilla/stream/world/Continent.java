package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Continent {
    private String nameContinent;
    private Set<Country> countryList = new HashSet<>();

    public Continent (String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public String getContinentName() {
        return nameContinent;
    }

    public Set<Country> getCountryList() {
        return new HashSet<>(countryList);
    }
}
