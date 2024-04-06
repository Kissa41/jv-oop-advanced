package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure implements Countable {
    int firstSide;
    int secondSide;
    int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (this.firstSide + this.secondSide)/2 * this.height;
    }

    @Override
    public void draw() {
        System.out.println( "Figure: circle, area: " + this.getArea() + "sq. units, firstSide: "
                + this.firstSide + " units, secondSide: " + this.secondSide + " units, height: "
                + this.height + " units, color: " + this.color);
    }
}
