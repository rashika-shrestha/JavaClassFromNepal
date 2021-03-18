package old_Classes.day14;

import java.util.Scanner;

public class Question29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        double a = 0;
        for (int i = 1; i <= n; i++) {
            a = a + ((double) i / findFactorial(i));
        }
        System.out.println("Sum of nth series is: " + a);
    }

    public static int findFactorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

}
