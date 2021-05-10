package day45_InnerClasses;

import day45_InnerClasses.NonStaticInnerClassDemo.InnerClass;

public class NonStaticTest {

    public static void main(String[] args) {
        NonStaticInnerClassDemo outerObj = new NonStaticInnerClassDemo();
        System.out.println(outerObj.outerVar);
        outerObj.outerMethod();

        InnerClass innerObj = outerObj.new InnerClass();
        System.out.println(innerObj.innerVar);
        innerObj.innerMethod();

    }
}
