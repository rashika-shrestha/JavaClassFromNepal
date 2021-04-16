package day31_ExceptionHandeling_Part2;

public class ExceptionDemo9_UncheckedException {

    public static void main(String[] args) {

        try {
            System.out.println("try start");
            long[] l = new long[1000000000];
            System.out.println("try end");
        } catch (Exception e) {
            System.out.println("inside catch");
        }

        System.out.println("more code...");
        System.out.println("more code...");
        System.out.println("more code...");
        System.out.println("exit");
    }
}
