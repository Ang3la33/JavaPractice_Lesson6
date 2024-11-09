package Problem6_4;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(6.2);

        System.out.println("c1 Perimeter = " + c1.getPerimeter());
        System.out.println("c1 Area = " + c1.getArea());
        System.out.println();
        System.out.println("c2 Perimeter = " + c2.getPerimeter());
        System.out.println("c2 Area = " + c2.getArea());

    }
}
