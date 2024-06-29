package core.basesyntax.figures;

import core.basesyntax.services.Color;

public abstract class Figure implements Countable {

    public Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
