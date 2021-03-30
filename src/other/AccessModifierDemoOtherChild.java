package other;

import day22.AccessModifierDemo;

public class AccessModifierDemoOtherChild extends AccessModifierDemo {

    public static void main(String[] args) {
        AccessModifierDemo  ob = new AccessModifierDemo();
//        ob.privateMethod();
//        ob.defaultMethod();
//        ob.protectedMethod();
        ob.publicMethod();

        AccessModifierDemoOtherChild obj = new AccessModifierDemoOtherChild();
        obj.protectedMethod();
    }
}
