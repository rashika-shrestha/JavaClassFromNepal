package day13_ObjectAndStatic;

public class NonStaticTest {

    public static void main(String[] args) {
        NonStaticDemo ob = new NonStaticDemo();
        System.out.println(ob.name);
        ob.greet();
    }
}
