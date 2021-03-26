package day20.AbstractClass;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape;
        System.out.println("++++++++++++");
        shape = new Triangle();
        shape.draw();
        System.out.println("++++++++++++++++++++++++");
        shape = new Circle();
        shape.draw();
    }
}
