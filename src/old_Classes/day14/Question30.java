package old_Classes.day14;

import java.util.Scanner;

public class Question30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        int first = 0;
        int next = 1;
        System.out.println(first);
        for (int i = 1; i <= n; i++) {
            System.out.println(next);
            int temp = next;
            next = first + next;
            first = temp;
        }
    }
}
