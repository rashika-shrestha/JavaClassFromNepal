package day46_InnerClass;

public class ShapeTest {

    public static void main(String[] args) {
        //anonymous inner class
        Shape triangle = new Shape(){
            @Override
            public void draw(){
                System.out.println("triangle is drawn...");
            }
        };
        triangle.draw();

        Shape circle = new Shape(){
            @Override
            public void draw(){
                System.out.println("circle is drawn...");
            }
        };
        circle.draw();

    }
}
