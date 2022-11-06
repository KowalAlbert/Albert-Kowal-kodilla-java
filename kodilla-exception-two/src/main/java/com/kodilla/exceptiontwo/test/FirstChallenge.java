package com.kodilla.exceptiontwo.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;

        try {
            result = firstChallenge.divide(3, 0);
            System.out.println("Wynik to: " + result);
        } catch (RuntimeException e) {
            System.out.println("Dzielenie przez zero jest niedozwolone!");
        } finally {
            System.out.println("Daje cos w finally, aby nie bylo, ze nic nie dalem.");
        }
    }
}