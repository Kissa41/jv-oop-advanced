package core.basesyntax.figures;

public class RightTriangle extends Figure implements Countable {
    int firstLeg;
    int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float getArea() {
        return (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println( "Figure: right triangle, area: " + this.getArea() +
                "sq. units, firstLeg: " + this.firstLeg + " units, secondLeg: " +
                this.secondLeg + " units, color: " + this.color);
    }
}
