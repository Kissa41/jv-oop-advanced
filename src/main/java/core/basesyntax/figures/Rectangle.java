package core.basesyntax.figures;

import core.basesyntax.services.Color;

public class Rectangle extends Figure {
    public int firstSide;
    public int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public float getArea() {
        return (float) firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.getArea() +
                "sq. units, first side: " + this.firstSide + " units, second side: " +
                this.secondSide + " units, color: " + Color.getValue(this.color));
    }
}


