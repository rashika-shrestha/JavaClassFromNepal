package day27_UncheckedExceptionHandeling_Part1;

import java.util.Scanner;

public class ExceptionDemo1 {

    private int x = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        int div = a / b;
        System.out.println("division of a and b is: " + div);
 /*       int[] arr = new int[2];
        System.out.println(arr[2]);

        ExceptionDemo1 obj = null;
          System.out.println(obj.x);

        String s = null;
         System.out.println(s.substring(0));

        String ss = "good";
        System.out.println(ss.substring(6));
*/
    }
}

//try  => block => {}
//catch  => block
//finally  => block
//throw  => statement
//throws => clause