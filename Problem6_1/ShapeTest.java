package Problem6_1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",false,5.5); // Upcast Problem6_1.Circle to Problem6_1.Shape
        System.out.println(s1); // Returns Problem6_1.Circle version
        System.out.println(s1.getArea()); // Returns Problem6_1.Circle version
        System.out.println(s1.getPerimeter()); // Returns Problem6_1.Circle version
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
       // System.out.println(s1.getRadius); // Error as Problem6_1.Shape s1 only has access to methods defined in the Problem6_1.Shape class and getRadius is defined in the Problem6_1.Circle class

        // Problem6_1.Shape cannot inherit methods from children class, only children classes can inherit methods from parent class

        // Problem6_1.Circle inherits everything from superclass Problem6_1.Shape
        // When Problem6_1.Shape class is downcast to Problem6_1.Circle class it can now use methods in Problem6_1.Shape and Problem6_1.Circle class
        Circle c1 = (Circle)s1; // Downcast back to Problem6_1.Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Problem6_1.Shape s2 = new Problem6_1.Shape(); // Error as abstract classes cannot be instantiated directly (serves only as a blueprint for other classes)


        Shape s3 = new Rectangle("RED",true,1.0,2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength); // Error as getLength is not a method in Problem6_1.Shape class and Problem6_1.Shape class cannot inherit methods from child class


        // Problem6_1.Rectangle class inherits all methods in superclass Problem6_1.Shape
        Rectangle r1 = (Rectangle)s3;  // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide);  // Error as getSide is not a method in Problem6_1.Shape class and cannot inherit method from the Problem6_1.Square class as Problem6_1.Square class is its child class

        // Problem6_1.Rectangle now inherits all methods in superclass Problem6_1.Shape
        Rectangle r2 = (Rectangle)s4; // Downcast Problem6_1.Shape to Problem6_1.Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide()); // Error as getSide is not a method in Problem6_1.Rectangle class or superclass Problem6_1.Shape and Problem6_1.Rectangle cannot inherit methods from its child class Problem6_1.Square
        System.out.println(r2.getLength());

        // Problem6_1.Square inherits all classes from superclass Problem6_1.Rectangle and in turn inherits all classes from Rectangles superclass Problem6_1.Shape as well
        Square sq1 = (Square)r2; // Downcast Problem6_1.Rectangle to Problem6_1.Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}