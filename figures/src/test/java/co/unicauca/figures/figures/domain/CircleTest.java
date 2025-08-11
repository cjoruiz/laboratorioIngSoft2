package co.unicauca.figures.figures.domain;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Circle
 * @author Cristian Ortega y Jose Rodriguez
 */
public class CircleTest {

    /**
     * Test of calculatePerimeter method, of class Circle.
     * Low value (radius = 3)
     */
    @Test
    public void testCalculatePerimeterLow() {
        System.out.println("calculatePerimeter - Low value");
        Circle instance = new Circle(3);
        double expected = 2 * Math.PI * 3;
        double result = instance.calculatePerimeter();
        assertEquals(expected, result, 0.01);
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     * Medium value (radius = 10)
     */
    @Test
    public void testCalculatePerimeterMedium() {
        System.out.println("calculatePerimeter - Medium value");
        Circle instance = new Circle(10);
        double expected = 2 * Math.PI * 10;
        double result = instance.calculatePerimeter();
        assertEquals(expected, result, 0.01);
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     * High value (radius = 1000)
     */
    @Test
    public void testCalculatePerimeterHigh() {
        System.out.println("calculatePerimeter - High value");
        Circle instance = new Circle(1000);
        double expected = 2 * Math.PI * 1000;
        double result = instance.calculatePerimeter();
        assertEquals(expected, result, 0.01);
    }

    /**
     * Test of calculateArea method, of class Circle.
     * Low value (radius = 3)
     */
    @Test
    public void testCalculateAreaLow() {
        System.out.println("calculateArea - Low value");
        Circle instance = new Circle(3);
        double expected = Math.PI * 3 * 3;
        double result = instance.calculateArea();
        assertEquals(expected, result, 0.01);
    }

    /**
     * Test of calculateArea method, of class Circle.
     * Medium value (radius = 333)
     */
    @Test
    public void testCalculateAreaMedium() {
        System.out.println("calculateArea - Medium value");
        Circle instance = new Circle(333);
        double expected = Math.PI * 333 * 333;
        double result = instance.calculateArea();
        assertEquals(expected, result, 0.01);
    }

    /**
     * Test of calculateArea method, of class Circle.
     * High value (radius = 12000)
     */
    @Test
    public void testCalculateAreaHigh() {
        System.out.println("calculateArea - High value");
        Circle instance = new Circle(12000);
        double expected = Math.PI * 12000 * 12000;
        double result = instance.calculateArea();
        assertEquals(expected, result, 0.01);
    }
}