package Problem6_3;

public class MovableRectangle implements Movable{

    // Instance variables
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    // Constructor that initiates both points with the same speed
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "Problem6_3.Movable Problem6_1.Rectangle [top left = (" + topLeft.x + ", " + topLeft.y + "), bottom right = (" + bottomRight.x + ", " + bottomRight.y + ")]";
    }

    // Method to check if the two points have the same speed
    private boolean hasSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    // Implement methods from the Problem6_3.Movable interface
    @Override
    public void moveUp() {
        if (hasSameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else {
            System.out.println("Cannot move the rectangle, the points have different speeds");
        }
    }
    @Override
    public void moveDown() {
        if (hasSameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else {
            System.out.println("Cannot move the rectangle, the points have different speeds");
        }
    }
    @Override
    public void moveLeft() {
        if (hasSameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else {
            System.out.println("Cannot move the rectangle, the points have different speeds");
        }
    }
    @Override
    public void moveRight() {
        if (hasSameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else {
            System.out.println("Cannot move the rectangle, the points have different speeds");
        }
    }
}
