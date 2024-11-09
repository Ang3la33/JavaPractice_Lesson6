package Problem6_3;

public class MovablePoint implements Movable{

    // instance variables
    int x, y, xSpeed, ySpeed;

    // constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "Problem6_3.Movable Point [X: " + this.x + ", Y: " + this.y + "X Speed: " + this.xSpeed + "Y Speed: " + this.ySpeed + "]";
    }

    // implement abstract methods declared in the interface Problem6_3.Movable
    @Override
    public void moveUp() {
        y -= ySpeed; // y axis pointing down for 2D graphics
    }

    @Override
    public void moveDown() {
        y += ySpeed; // move down by increasing y
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; // move left by decreasing x
    }

    @Override
    public void moveRight() {
        x += xSpeed; // move right by increasing x
    }


}
