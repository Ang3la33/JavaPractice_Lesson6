package Problem6_3;

public class MovableCircle implements Movable {

    // instance variables
    private int radius;
    private MovablePoint center;

    // constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Problem6_3.Movable Problem6_1.Circle with center at (" + this.center.x + ", " + this.center.y +") and radius " + this.radius;
    }

    // implement abstract methods declared in the interface Moveable
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;  // move the center up by ySpeed
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed; // move the center down by ySpeed
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed; // move the center left by xSpeed
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed; // move the center right by xSpeed
    }


}
