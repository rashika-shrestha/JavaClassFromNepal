package old_Classes.day8_Explicit_Implicit_TypeCasting;

public class Question11b {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Before swapping a is: " + a);
        System.out.println("Before swapping b is: " + b);
        a = a + b;//5+6=11
        b = a - b;//11-6=5
        a = a - b;//11-5=6
        System.out.println("After swapping a is: " + a);
        System.out.println("After swapping b is: " + b);
    }
}
