package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }


    @DisplayName("when create List without elements, " +
            "then exterminate should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator terminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();

        //When
        List<Integer> expectedResult = new ArrayList<>();
        List<Integer> result = terminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }


    @DisplayName("when create List as normal, " +
            "then exterminate should return list with only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator terminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        //When
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);
        List<Integer> result = terminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

}
