package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }

    // BELOW IS THE MAIN APP

    public static void main(String[] args) {
        User user = new User("John", "Doe");

        LocalDate rentFrom = LocalDate.of(2017, 8, 1);
        LocalDate rentTo = LocalDate.of(2017, 8, 10);
        RentRequest rentRequest = new RentRequest(user,rentFrom, rentTo);

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
