package core.basesyntax.figures;

public class Circle extends Figure implements Countable {
    int radius;
    private float Pi = 3.14f;
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (this.Pi * Math.pow(this.radius, 2));
    }

    @Override
    public void draw() {
        System.out.println( "Figure: circle, area: " + this.getArea() + "sq. units, radius: "
                + this.radius + " units, color: " + this.color);
    }
}
