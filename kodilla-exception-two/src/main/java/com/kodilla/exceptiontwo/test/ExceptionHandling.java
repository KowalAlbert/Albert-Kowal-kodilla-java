package com.kodilla.exceptiontwo.test;

import com.kodilla.exceptiontwo.test.SecondChallenge;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String done = secondChallenge.probablyIWillThrowException(1, 1);
            System.out.println(done);
        } catch (Exception e) {
            System.out.println("Exception found:   " + e);
        } finally {
            System.out.println("Finally 'finally' has been finally included.");
        }
    }
}