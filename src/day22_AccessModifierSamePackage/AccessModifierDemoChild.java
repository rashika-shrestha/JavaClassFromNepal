package day22_AccessModifierSamePackage;

public class AccessModifierDemoChild extends AccessModifierDemo{

    public static void main(String[] args) {
        AccessModifierDemo  ob = new AccessModifierDemo(5);
//        ob.privateMethod();
        ob.defaultMethod();
        ob.protectedMethod();
        ob.publicMethod();
    }
}
