package Problem6_1;

public class Rectangle extends Shape {

    protected double width;
    protected double length;


    public Rectangle(double side1, double side2, String color, boolean filled) {
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Problem6_1.Rectangle [width = " + width + ", length = " + length + ", color = " + getColor() + ", filled = " + isFilled() + "]";
    }

}
