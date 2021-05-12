package day46_InnerClass;

import day46_InnerClass.StaticInnerClassDemo.InnerClass;

public class StaticInnerTest {

    public static void main(String[] args) {
        System.out.println(StaticInnerClassDemo.outerVar);
        StaticInnerClassDemo.outerMethod();

        System.out.println(InnerClass.innerVar);
        InnerClass.innerMethod();
    }
}
