package co.unicauca.figures.figures.domain;

/**
 *
 * @author Cristian Ortega y Jose Rodriguez
 */
public class Triangle implements Figure {
       private double sideA ;
       private double sideB ;
       private double sideC ;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
       
    @Override
    public double calculatePerimeter() {
    return  sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
    double semiPerimeter = calculatePerimeter() / 2;
    return Math.sqrt(semiPerimeter *
            (semiPerimeter - sideA) *
            (semiPerimeter - sideB) *
            (semiPerimeter - sideC)
        );
    }

}