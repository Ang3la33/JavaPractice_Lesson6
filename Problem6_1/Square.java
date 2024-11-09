package Problem6_1;

public class Square extends Rectangle {



    public Square() {
        super(1.0,1.0);
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side1, double side2) {
        super(color, filled, side1, side2);
    }

    public double getSide() {
        return width; // Could either return width or length as they are equal on a square
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    // Override setWidth to make sure that width and length stay equal
    public void setWidth(double width) {
        setSide(width); // call setSide to keep width and length equal
    }
    // Override setLength to ensure width and length remain the same
    @Override
    public void setLength(double length) {
        setSide(length); // call setSide to keep width and length equal
    }

    @Override
    public String toString() {
        return "Problem6_1.Square [side = " + width + ", color = " + getColor() + ", filled = " + isFilled() + "]";
    }


}
