package Problem6_4;

public class TestResizableCircle {
    public static void main(String[] args) {

        ResizableCircle rc1 = new ResizableCircle(3.2);

        System.out.println("Initial radius = " + rc1.radius);
        System.out.println("Initial perimeter = " + rc1.getPerimeter());
        System.out.println("Initial area = " + rc1.getArea());
        System.out.println();
        rc1.resize(50);
        System.out.println("Circle resized by 50%");
        System.out.println("Updated radius = " + rc1.radius);
        System.out.println("Updated perimeter = " + rc1.getPerimeter());
        System.out.println("Updated area = " + rc1.getArea());
    }
}
