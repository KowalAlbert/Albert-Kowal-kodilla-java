package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface RentalService {

    public boolean rent(User user, LocalDate from, LocalDate to);
}
