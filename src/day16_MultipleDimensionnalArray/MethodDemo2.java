package day16_MultipleDimensionnalArray;

public class MethodDemo2 {

    public static void printArray(int... arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        printArray(arr);
        System.out.println("==================");
        printArray(new int[]{4, 5, 6});
        System.out.println("++++++++++++++++++++++++");
        printArray(4, 7, 8);
    }
}
