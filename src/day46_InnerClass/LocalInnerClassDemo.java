package day46_InnerClass;

public class LocalInnerClassDemo {

    public void findSum() {
        int a = 5;
        class LocalInnerClass {
            int b = 6;
            void sum() {
                int r = a + b;
                System.out.println("Sum is: " + r);
            }
        }
        LocalInnerClass ob = new LocalInnerClass();
        ob.sum();
    }

    public static void main(String[] args) {
        LocalInnerClassDemo ob = new LocalInnerClassDemo();
        ob.findSum();
    }
}
