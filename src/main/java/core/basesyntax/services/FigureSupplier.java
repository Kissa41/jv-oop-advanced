package core.basesyntax.services;

import core.basesyntax.figures.*;

import java.util.Random;

import static core.basesyntax.services.Color.WHITE;

public class FigureSupplier {

    private static final int RANGE_OF_RANDOM_SIZE = 100;
    private static final int RADIUS_FOR_DEFAULT_FIGURE = 10;

    public Figure getRandomFigure() {

        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        Random random = new Random();

        Shape[] figures = Shape.values();
        Shape figure = figures[random.nextInt(figures.length)];

        int firstLength = random.nextInt(RANGE_OF_RANDOM_SIZE);
        int secondLength = random.nextInt(RANGE_OF_RANDOM_SIZE);
        int thirdLength = random.nextInt(RANGE_OF_RANDOM_SIZE);

        return switch (figure) {
            case CIRCLE -> new Circle(color, firstLength);
            case SQUARE -> new Square(color, firstLength);
            case ISOSCELESTRAPEZOID -> new IsoscelesTrapezoid(color, firstLength, secondLength, thirdLength);
            case RIGHTTRIANGLE -> new RightTriangle(color, firstLength, secondLength);
            case RECTANGLE -> new Rectangle(color, firstLength, secondLength);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {

        return new Circle(WHITE, RADIUS_FOR_DEFAULT_FIGURE);
    }
}
