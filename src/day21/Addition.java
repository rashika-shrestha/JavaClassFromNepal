package day21;

//compile time polymorphism(static binding)
//which can be achieved by overloading of methods
public class Addition {

    public void sum() {
        int a = 5;
        int b = 6;
        int r = a + b;
        System.out.println("1.sum is: " + r);
    }

    public void sum(int a, int b) {
        int r = a + b;
        System.out.println("2.sum is: " + r);
    }

    public void sum(double  a, double b) {
        double r = a + b;
        System.out.println("3.sum is: " + r);
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.sum();
        addition.sum(4, 5);
        addition.sum(4.5, 6.7);
    }
}
