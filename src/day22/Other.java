package day22;

public class Other {

    public static void main(String[] args) {
        AccessModifierDemo  ob = new AccessModifierDemo(5);
//        ob.privateMethod();
        ob.defaultMethod();
        ob.protectedMethod();
        ob.publicMethod();

        Demo.greet();
    }
}
