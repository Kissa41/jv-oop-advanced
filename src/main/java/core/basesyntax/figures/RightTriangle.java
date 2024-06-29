package core.basesyntax.figures;

import core.basesyntax.services.Color;

public class RightTriangle extends Figure {
    public int firstLeg;
    public int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float getArea() {
        return (float) (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.getArea() +
                "sq. units, firstLeg: " + this.firstLeg + " units, secondLeg: " +
                this.secondLeg + " units, color: " + Color.getValue(this.color));
    }
}
