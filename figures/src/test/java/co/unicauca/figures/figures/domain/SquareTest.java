/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.figures.domain;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Cristian Ortega y Jose Rodriguez
 */
public class SquareTest {

    /**
     * Test of calculatePerimeter method, of class Square. 
     * Low value (side = 2)
     */
    @Test
    public void testCalculatePerimeterLow() {
        System.out.println("calculatePerimeter");
        Square instance = new Square(2);
        double expResult = 2*4;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateArea method, of class Square. 
     * Low value (side = 4)
     */
    @Test
    public void testCalculateAreaLow() {
        System.out.println("calculateArea");
        Square instance = new Square(2);
        double expResult = 4.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculatePerimeter method, of class Square. 
     * Medium value (side = 50)
     */
    @Test
    public void testCalculatePerimeterMedium() {
        System.out.println("calculatePerimeter");
        Square instance = new Square(50);
        double expResult = 200.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateArea method, of class Square. 
     * Medium value (side = 70)
     */
    @Test
    public void testCalculateAreaMedium() {
        System.out.println("calculateArea");
        Square instance = new Square(70);
        double expResult = 4900.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculatePerimeter method, of class Square. 
     * High value (side = 1000)
     */
    @Test
    public void testCalculatePerimeterHigh() {
        System.out.println("calculatePerimeter");
        Square instance = new Square(1000);
        double expResult = 4000.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateArea method, of class Square. 
     * High value (side = 1200)
     */
    @Test
    public void testCalculateAreaHigh() {
        System.out.println("calculateArea");
        Square instance = new Square(1200);
        double expResult = 1440000.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }
}
