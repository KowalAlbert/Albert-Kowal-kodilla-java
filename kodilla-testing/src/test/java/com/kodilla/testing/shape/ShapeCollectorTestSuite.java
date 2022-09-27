package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suite")
class ShapeCollectorTestSuite {
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
    void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle1 = new Circle(1);

        //When
        collector.addFigure(circle1);

        //Then
        Assertions.assertEquals("Figures: Circle , ", collector.showFigures());
    }

    @Test
    void testRemoveNonExistingFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle1 = new Circle(1);

        //When
        boolean result = collector.removeFigure(circle1);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle1 = new Circle(1);
        collector.addFigure(circle1);

        //When
        boolean result = collector.removeFigure(circle1);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals("Figures: ", collector.showFigures());
    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle1 = new Circle(1);
        collector.addFigure(circle1);

        //When
        String retrievedShape;
        retrievedShape = collector.getFigure(0);

        //Then
        Assertions.assertEquals(circle1.getShape(), retrievedShape);
    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle1 = new Circle(1);
        Triangle triangle1 = new Triangle(1, 1);
        Square square1 = new Square(1);

        //When
        collector.addFigure(circle1);
        collector.addFigure(triangle1);
        collector.addFigure(square1);

        //Then
        Assertions.assertEquals("Figures: Circle , Triangle , Square , ", collector.showFigures());
    }
}
