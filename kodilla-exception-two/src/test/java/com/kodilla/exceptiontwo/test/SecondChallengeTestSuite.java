package com.kodilla.exceptiontwo.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testNoException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 1))
        );
    }

    @Test
    void testBigX() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1));
    }

    @Test
    void testSmallX() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.999, 1));
    }

    @Test
    void testWrongY() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
    }

    @Test
    void testBothWrong() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
    }

}