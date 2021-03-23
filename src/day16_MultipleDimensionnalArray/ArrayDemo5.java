package day16_MultipleDimensionnalArray;

public class ArrayDemo5 {

    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLS = 3;
        int[][] arr = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
