package day15_SingleDimensionalArray;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int [] arr = new int[3];
        Scanner input = new Scanner(System.in);
        //to take input in ana array
        for(int i=0; i < arr.length; i++){
            System.out.println("Enter element: ");
            arr[i] = input.nextInt();
        }

        //to print an elemnts of an array
        System.out.println("====printing=====");
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("====================");
    }
}

//array: is a collection of elements of same data type
//arranged in a sequential manner