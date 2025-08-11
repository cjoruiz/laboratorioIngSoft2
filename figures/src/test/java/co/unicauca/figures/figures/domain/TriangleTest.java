
package co.unicauca.figures.figures.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Cristian Ortega y Jose Rodriguez
 */
public class TriangleTest {
   
    /**
     * Test of calculatePerimeter method, of class Triangle.
     * Low value (sideA = 2, sideB = 2, sideC = 2)
     */
    @Test
    public void testCalculatePerimeterLow() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(2,2,2);
        double expResult = 6.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateArea method, of class Triangle.
     * Low value (sideA = 2, sideB = 2, sideC = 2)
     */
    @Test
    public void testCalculateAreaLow() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(2,2,2);
        double expResult = Math.sqrt(3);
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     /**
     * Test of calculatePerimeter method, of class Triangle.
     * Medium value (sideA = 30, sideB = 40, sideC = 50)
     */
    @Test
    public void testCalculatePerimeterMedium() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(30,40,50);
        double expResult = 120.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateArea method, of class Triangle.
     * Medium value (sideA = 30, sideB = 40, sideC = 50)
     */
    @Test
    public void testCalculateAreaMedium() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(30,40,50);
        double expResult = 600.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }
      
     /**
     * Test of calculatePerimeter method, of class Triangle.
     * High value (sideA = 2501, sideB = 2501, sideC = 4998)
     */
    @Test
    public void testCalculatePerimeterHigh() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(2501,2501,4998);
        double expResult = 10000.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateArea method, of class Triangle.
     * High value (sideA = 2501, sideB = 2501, sideC = 4998)
     */
    @Test
    public void testCalculateAreaHigh() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(2501,2501,4998);
        double expResult = 249900.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }
}
