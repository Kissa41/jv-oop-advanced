package core.basesyntax.services;

import core.basesyntax.figures.*;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure(){
        ColorSupplier service = new ColorSupplier();
        String color = service.getRandomColor();

        Random rand = new Random();

        Shape[] figures = Shape.values();
        String figure = String.valueOf(figures[rand.nextInt(figures.length)]).toLowerCase();

        int firstLength = rand.nextInt(100);
        int secondLength = rand.nextInt(100);
        int thirdLength = rand.nextInt(100);

        switch (figure) {
            case "circle":
                return new Circle(color, firstLength);
            case "square":
                return new Square(color, firstLength);
            case "isoscelestrapezoid":
                return new IsoscelesTrapezoid(color, firstLength, secondLength, thirdLength);
            case "righttriangle":
                return new RightTriangle(color, firstLength, secondLength);
            default: return this.getDefaultFigure();
        }
    }

    public Figure getDefaultFigure(){
        return new Circle("white", 10);
    }
}
