package day22b_AccesModifier_OtherPackage_AcessFrom_day22a;

import day22a_AccessModifierSamePackage.AccessModifierDemo;

public class OtherClass {

    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo();

//        ob.privateMethod();
//        ob.defaultMethod();
//        ob.protectedMethod();
          ob.publicMethod();

    }
}
