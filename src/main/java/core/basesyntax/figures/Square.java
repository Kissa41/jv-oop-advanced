package core.basesyntax.figures;

import core.basesyntax.services.Color;

public class Square extends Figure {
    public int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return (float) Math.pow(this.side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.getArea() +
                "sq. units, side: " + this.side + " units, color: " + Color.getValue(this.color));
    }
}
