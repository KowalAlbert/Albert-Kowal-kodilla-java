package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface RentalRepository {

    void createRental(User user, LocalDate from, LocalDate to);
}
