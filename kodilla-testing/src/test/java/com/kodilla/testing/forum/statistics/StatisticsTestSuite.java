package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = ("User nr " + n);
            resultList.add(theUser);
        }
        return resultList;
    }

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testWhenNumberOfPostsEqualsZero() {
        // Given
        List<String> resultListOfUsers = new ArrayList<>();
        resultListOfUsers.add("Pan Test");
        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);

        // When
        String theResult = statisticCalculator.showStatistics();

        // Then
        assertEquals("Number of Users: 1.0"
                + " | Number of Posts: 0.0"
                + " | Number of Comments: 1.0"
                + " | Number of Posts per User: 0.0"
                + " | Number of Comments per User: 1.0"
                + " | Number of Comments per Post: 0.0",
                theResult);
    }

    @Test
    void testWhenNumberOfPostsEqualsThousand() {
        // Given
        List<String> resultListOfUsers = new ArrayList<>();
        resultListOfUsers.add("Pan Test");
        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);

        // When
        String theResult = statisticCalculator.showStatistics();

        // Then
        assertEquals("Number of Users: 1.0"
                        + " | Number of Posts: 1000.0"
                        + " | Number of Comments: 1.0"
                        + " | Number of Posts per User: 1000.0"
                        + " | Number of Comments per User: 1.0"
                        + " | Number of Comments per Post: 0.001",
                theResult);
    }

    @Test
    void testWhenNumberOfCommentsEqualsZero() {
        // Given
        List<String> resultListOfUsers = new ArrayList<>();
        resultListOfUsers.add("Pan Test");
        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);

        // When
        String theResult = statisticCalculator.showStatistics();

        // Then
        assertEquals("Number of Users: 1.0"
                        + " | Number of Posts: 1.0"
                        + " | Number of Comments: 0.0"
                        + " | Number of Posts per User: 1.0"
                        + " | Number of Comments per User: 0.0"
                        + " | Number of Comments per Post: 0.0",
                theResult);
    }

    @Test
    void testWhenMorePostsThanComments() {
        // Given
        List<String> resultListOfUsers = new ArrayList<>();
        resultListOfUsers.add("Pan Test");
        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);

        // When
        String theResult = statisticCalculator.showStatistics();

        // Then
        assertEquals("Number of Users: 1.0"
                        + " | Number of Posts: 100.0"
                        + " | Number of Comments: 10.0"
                        + " | Number of Posts per User: 100.0"
                        + " | Number of Comments per User: 10.0"
                        + " | Number of Comments per Post: 0.1",
                theResult);
    }

    @Test
    void testWhenLessPostsThanComments() {
        // Given
        List<String> resultListOfUsers = new ArrayList<>();
        resultListOfUsers.add("Pan Test");
        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);

        // When
        String theResult = statisticCalculator.showStatistics();

        // Then
        assertEquals("Number of Users: 1.0"
                        + " | Number of Posts: 10.0"
                        + " | Number of Comments: 100.0"
                        + " | Number of Posts per User: 10.0"
                        + " | Number of Comments per User: 100.0"
                        + " | Number of Comments per Post: 10.0",
                theResult);
    }

    @Test
    void testWhenNumberOfUsersEqualsZero() {
        // Given
        List<String> resultListOfUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(1);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);

        // When
        String theResult = statisticCalculator.showStatistics();

        // Then
        assertEquals("Number of Users: 0.0"
                        + " | Number of Posts: 1.0"
                        + " | Number of Comments: 1.0"
                        + " | Number of Posts per User: 0.0"
                        + " | Number of Comments per User: 0.0"
                        + " | Number of Comments per Post: 1.0",
                theResult);
    }

    @Test
    void testWhenNumberOfUsersEqualsHundred() {
        // Given
        List<String> resultListOfUsers = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(1);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);

        // When
        String theResult = statisticCalculator.showStatistics();

        // Then
        assertEquals("Number of Users: 100.0"
                        + " | Number of Posts: 1.0"
                        + " | Number of Comments: 1.0"
                        + " | Number of Posts per User: 0.01"
                        + " | Number of Comments per User: 0.01"
                        + " | Number of Comments per Post: 1.0",
                theResult);
    }
}
