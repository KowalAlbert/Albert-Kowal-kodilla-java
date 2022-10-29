package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ranGen = new Random();
        int round = 0;
        boolean win = false;
        int player = 0;
        int comp = 0;
        char choice;
        int compChoice = 0;
        int winAmount = 0;

        System.out.println("Witaj w grze KAMIEN-PAPIER-NOZYCE");
        System.out.println("Jak masz na imie?");
        String name = sc.nextLine();
        System.out.println("Witaj " + name + ". Do ilu zwyciestw chcesz zagrac?");
        winAmount = sc.nextInt();

        while (!win) {
            round++;
            System.out.println("");
            System.out.println("--< RUNDA " + round + " >--");
            System.out.println("WYNIK: " + name + " " + player + ":" + comp + " Komputer");
            System.out.println("Wybierz swoj ruch: ");
            System.out.println("1 - KAMIEN");
            System.out.println("2 - PAPIER");
            System.out.println("3 - NOZYCE");
            System.out.println("x - zakonczenie aktualnej gry");
            System.out.println("n - rozpocznij gre od nowa");
            choice = sc.next().charAt(0);

            while (choice != '1' && choice != '2' && choice != '3' && choice != 'x' && choice != 'X' && choice != 'n' && choice != 'N') {
                System.out.println("Niepoprawny wybor opcji. Wybierz jeszcze raz: ");
                choice = sc.next().charAt(0);
            }

            if (choice == '1') {
                compChoice = 1 + ranGen.nextInt(3);
                if (compChoice == 1) {
                    System.out.println("Komputer wybral: KAMIEN");
                    System.out.println("REMIS");
                }
                if (compChoice == 2) {
                    System.out.println("Komputer wybral: PAPIER");
                    System.out.println("PRZEGRANA");
                    comp++;
                }
                if (compChoice == 3) {
                    System.out.println("Komputer wybral: NOZYCE");
                    System.out.println("WYGRANA");
                    player++;
                }
            }

            if (choice == '2') {
                compChoice = 1 + ranGen.nextInt(3);
                if (compChoice == 2) {
                    System.out.println("Komputer wybral: PAPIER");
                    System.out.println("REMIS");
                }
                if (compChoice == 3) {
                    System.out.println("Komputer wybral: NOZYCE");
                    System.out.println("PRZEGRANA");
                    comp++;
                }
                if (compChoice == 1) {
                    System.out.println("Komputer wybral: KAMIEN");
                    System.out.println("WYGRANA");
                    player++;
                }
            }

            if (choice == '3') {
                compChoice = 1 + ranGen.nextInt(3);
                if (compChoice == 3) {
                    System.out.println("Komputer wybral: NOZYCE");
                    System.out.println("REMIS");
                }
                if (compChoice == 1) {
                    System.out.println("Komputer wybral: KAMIEN");
                    System.out.println("PRZEGRANA");
                    comp++;
                }
                if (compChoice == 2) {
                    System.out.println("Komputer wybral: PAPIER");
                    System.out.println("WYGRANA");
                    player++;
                }
            }

            if (choice == 'x' || choice == 'X') {
                System.out.println("Czy na pewno zakonczyc gre?");
                choice = sc.next().charAt(0);
                round--;
                if (choice == 't' || choice == 'T') {
                    System.out.println("ZAMKNIECIE GRY");
                    win = true;
                    player = 0;
                    comp = 0;
                    round = 0;
                }
                choice = 'p';
            }

            if (choice == 'n' || choice == 'N') {
                System.out.println("Czy na pewno zaczac gre od nowa?");
                choice = sc.next().charAt(0);
                round--;
                if (choice == 't' || choice == 'T') {
                    System.out.println("RESTARTOWANIE GRY");
                    win = false;
                    player = 0;
                    comp = 0;
                    round = 0;
                    System.out.println("");
                    System.out.println("Witaj " + name + ". Do ilu zwyciestw chcesz zagrac?");
                    winAmount = sc.nextInt();
                }
            }

            if (player == winAmount) {
                System.out.println("");
                System.out.println("WYNIK OSTATECZNY: " + name + " " + player + ":" + comp + " Komputer");
                System.out.println("Gratuluje wygranej rozgrywki.");
                System.out.println("");
                Thread.sleep(6000);

                System.out.println("Czy rozpoczac nowa rozgrywke?");
                choice = sc.next().charAt(0);
                if (choice == 't' || choice == 'T') {
                    System.out.println("RESTARTOWANIE GRY");
                    win = false;
                    player = 0;
                    comp = 0;
                    round = 0;
                    System.out.println("");
                    System.out.println("Witaj " + name + ". Do ilu zwyciestw chcesz zagrac?");
                    winAmount = sc.nextInt();
                } else {
                    System.out.println("Dziekuje za zagranie w moja gre.");
                    Thread.sleep(3000);
                    win = true;
                }
            }
            if (comp == winAmount) {
                System.out.println("");
                System.out.println("WYNIK OSTATECZNY: " + name + " " + player + ":" + comp + " Komputer");
                System.out.println("Przegrales rozgrywke. Moze pojdzie lepiej nastepnym razem.");
                System.out.println("");
                Thread.sleep(6000);

                System.out.println("Czy rozpoczac nowa rozgrywke?");
                choice = sc.next().charAt(0);
                if (choice == 't' || choice == 'T') {
                    System.out.println("RESTARTOWANIE GRY");
                    win = false;
                    player = 0;
                    comp = 0;
                    round = 0;
                    System.out.println("");
                    System.out.println("Witaj " + name + ". Do ilu zwyciestw chcesz zagrac?");
                    winAmount = sc.nextInt();
                } else {
                    System.out.println("Dziekuje za zagranie w moja gre.");
                    Thread.sleep(1500);
                    win = true;
                }
            }

            Thread.sleep(1500);
        }
        //KONIEC
    }
}
