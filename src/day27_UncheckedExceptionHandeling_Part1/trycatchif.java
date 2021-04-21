package day27_UncheckedExceptionHandeling_Part1;

import java.util.InputMismatchException;

public class trycatchif {

    public static void main(String[] args) {
        try {
        int [] a = {4};
            System.out.println(a[1]);
            System.out.println("a is greater than b");
        }catch (InputMismatchException ie) {
            System.out.println("An exception happened");

        }


        }
    }
