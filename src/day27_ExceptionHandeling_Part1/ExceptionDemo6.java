package day27_ExceptionHandeling_Part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a: ");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            int div = divide(a, b);
            System.out.println("Division of a and b is: " + div);
        } catch (ArithmeticException | InputMismatchException ae) {
            System.out.println(ae);
        }

        System.out.println("exit");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
