package day13_ObjectAndStatic;

public class StaticDemo {

    //static variable(class level member)
    static String name ="my name is khan";

    //static method(class level behavior)
    public static void greet(){

        System.out.println("hello, good morning...");
    }

    public static void main(String[] args) {
        System.out.println(name);
        greet();

        //best approach
        System.out.println(StaticDemo.name);
        StaticDemo.greet();
    }
}
