package co.unicauca.figures.figures;

import co.unicauca.figures.figures.domain.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian Ortega y Jose Rodriguez
 */
public class Main {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1);
        Figure fig2 = new Circle(2);
        Figure fig3 = new Square(2);
        Figure fig4 = new Triangle(2, 2, 2);

        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);

        for (Figure fig : figures) {
            System.out.println("El area es: " + fig.calculateArea());
            System.out.println("El perimetro es: " + fig.calculatePerimeter());
        }
    }
}
