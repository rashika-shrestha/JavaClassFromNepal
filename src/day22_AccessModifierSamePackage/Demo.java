package day22_AccessModifierSamePackage;

public class Demo {

    public static void greet() {
        System.out.println("hello, good morning...");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public void findAvg(int a, int b) {
        int r = sum(a, b);
        int avg = r / 2;
        System.out.println("Average is: " + avg);
    }


    public static void main(String[] args) {
        Demo.greet();
    }
}
