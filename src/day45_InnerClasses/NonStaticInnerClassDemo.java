package day45_InnerClasses;

public class NonStaticInnerClassDemo {

    String outerVar = "This is outer variable";


    public void outerMethod (){
        System.out.println("This is outer method.");
    }

    public NonStaticInnerClassDemo(){
        System.out.println("outer constructor");
    }


    public class InnerClass {

        String innerVar = "This is inner variable";

        public void innerMethod(){
            System.out.println("This is inner method...");
        }

        public InnerClass (){
            System.out.println("Inner constructor.");
        }
    }

    public static void main(String[] args) {
        NonStaticInnerClassDemo outerObj = new NonStaticInnerClassDemo();
        System.out.println(outerObj.outerVar);
        outerObj.outerMethod();

        InnerClass innerObj = outerObj.new InnerClass();
        System.out.println(innerObj.innerVar);
        innerObj.innerMethod();

    }
}
