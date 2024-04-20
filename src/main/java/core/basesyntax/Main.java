package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.services.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++){
            if (i < 3) figures[i] = figureSupplier.getRandomFigure();
            else figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
