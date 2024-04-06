package core.basesyntax.figures;

public class Square extends Figure implements Countable {
    int side;
    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return (float) Math.pow(this.side, 2);
    }

    @Override
    public void draw() {
        System.out.println( "Figure: square, area: " + this.getArea() +
                "sq. units, side: " + this.side + " units, color: " + this.color);
    }
}
