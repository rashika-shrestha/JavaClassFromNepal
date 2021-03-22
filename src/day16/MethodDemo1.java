package day16;

import java.util.Scanner;

public class MethodDemo1 {

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] returnArray(Scanner input) {
        System.out.println("Enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {34, 56, 67};
        printArray(arr);

        Scanner input = new Scanner(System.in);
        int[] ar = returnArray(input);
        printArray(ar);
    }
}
