package day22_AccesFromOtherPackage;

import day22_AccessModifierSamePackage.AccessModifierDemo;

public class OtherClass {

    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo();

//        ob.privateMethod();
//        ob.defaultMethod();
//        ob.protectedMethod();
          ob.publicMethod();

    }
}
