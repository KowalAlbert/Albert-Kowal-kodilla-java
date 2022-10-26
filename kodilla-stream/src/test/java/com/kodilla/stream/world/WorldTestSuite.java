package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Germany", new BigDecimal("20000000")));
        europe.addCountry(new Country("France", new BigDecimal("20000000")));
        europe.addCountry(new Country("Spain", new BigDecimal("20000000")));

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new Country("Canada", new BigDecimal("60000000")));
        northAmerica.addCountry(new Country("USA", new BigDecimal("60000000")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("60000000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("120000000")));
        asia.addCountry(new Country("India", new BigDecimal("120000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("120000000")));

        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("600000000");
        assertEquals(expectedPeople, totalPeople);
    }
}