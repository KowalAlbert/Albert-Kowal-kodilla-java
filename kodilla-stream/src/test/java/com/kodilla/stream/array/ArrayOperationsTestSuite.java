package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTestSuite  {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
        }

        //When
        double testingAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(19.5, testingAverage);
    }
}