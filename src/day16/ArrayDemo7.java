package day16;

public class ArrayDemo7 {

    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6}, {5, 6, 7}, {8, 9, 3}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
