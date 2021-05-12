package day46_InnerClass;

public class StaticInnerClassDemo {

    static String outerVar = "this is outer variable";

    public static void outerMethod(){
        System.out.println("this is outer method.");
    }

    public static class InnerClass {
        static String innerVar = "this is inner variable";

        public  static void innerMethod(){
            System.out.println("this is inner method");
        }
    }

    public static void main(String[] args) {
        System.out.println(StaticInnerClassDemo.outerVar);
        StaticInnerClassDemo.outerMethod();

        System.out.println(InnerClass.innerVar);
        InnerClass.innerMethod();

    }
}
