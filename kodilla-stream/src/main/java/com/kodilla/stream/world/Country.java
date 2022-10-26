package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String name;
    private BigDecimal peopleQuantity = new BigDecimal("0");

    public Country (String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
