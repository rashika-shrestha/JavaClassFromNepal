package day27_ExceptionHandeling_Part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[2];
        try {
            System.out.println("Enter a: ");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            int div = divide(a, b);
            System.out.println("Division of a and b is: " + div);
            System.out.println(arr[2]);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }catch (InputMismatchException ie) {
            System.out.println(ie);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("exit");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
