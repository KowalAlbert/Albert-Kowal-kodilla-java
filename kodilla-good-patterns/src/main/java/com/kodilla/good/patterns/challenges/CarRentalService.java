package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class CarRentalService implements RentalService {
    @Override
    public boolean rent(User user, LocalDate from, LocalDate to) {
        System.out.println("Wywolano CarRentalService");
        return false;
    }
}
