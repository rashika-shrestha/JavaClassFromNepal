package old_Classes.day8_Explicit_Implicit_TypeCasting;

public class Question11a {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Before swapping a is: " + a);
        System.out.println("Before swapping b is: " + b);
        int temp = 5;
        a = b;
        b = temp;
        System.out.println("After swapping a is: " + a);
        System.out.println("After swapping b is: " + b);
    }
}
