package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class CarRentalRepository implements RentalRepository {
    @Override
    public void createRental(User user, LocalDate from, LocalDate to) {
        System.out.println("Wywolano CarRentalRepository");
    }
}
