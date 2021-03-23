package day16_MultipleDimensionnalArray;

public class ForEachDemo2 {

    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6}, {5, 6, 7}, {8, 9, 3}};

        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
