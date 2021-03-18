package day13_ObjectAndStatic;

public class NonStaticDemo {

    //non-static variable, instance variable, properties, data, member's data, attributes
    String name = "raju bhai";

    //non-static method(object's behavior)
    public void greet() {
        System.out.println("hello, good night.");
    }

    public static void main(String[] args) {
        NonStaticDemo ob = new NonStaticDemo();
        System.out.println(ob.name);
        ob.greet();
    }
}
