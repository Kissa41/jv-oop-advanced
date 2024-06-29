package core.basesyntax.figures;

import core.basesyntax.services.Color;

public class IsoscelesTrapezoid extends Figure {
    public int firstSide;
    public int secondSide;
    public int height;

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (float) (this.firstSide + this.secondSide) / 2 * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.getArea() + "sq. units, firstSide: "
                + this.firstSide + " units, secondSide: " + this.secondSide + " units, height: "
                + this.height + " units, color: " + Color.getValue(this.color));
    }
}
