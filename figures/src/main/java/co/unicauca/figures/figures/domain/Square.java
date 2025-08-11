package co.unicauca.figures.figures.domain;

/**
 *
 * @author Cristian Ortega y Jose Rodriguez
 */
public class Square implements Figure{
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
       return side*4;
    }
    @Override
    public double calculateArea() {
        return side*side;
    }
}
