package day27_ExceptionHandeling;

import java.util.Scanner;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();

        try {
            System.out.println("try start");
            int div = divide(a, b);
            System.out.println("Division of a and b is: " + div);
            System.out.println("try end");
        } catch (ArithmeticException ae) {
            System.out.println("inside catch");
        }

        System.out.println("exit");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
