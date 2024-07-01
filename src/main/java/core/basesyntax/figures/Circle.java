package core.basesyntax.figures;

import core.basesyntax.services.Color;

public class Circle extends Figure {
    public int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.getArea() + "sq. units, radius: "
                + this.radius + " units, color: " +  color.getValue());
    }
}
