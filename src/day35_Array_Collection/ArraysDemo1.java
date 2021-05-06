package day35_Array_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo1 {

    public static void main(String[] args) {
        int [] arr = {34, 23, 45, 13, 12};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(Arrays.binarySearch(arr, 25));
        int [] ar = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(ar));

        List<Integer> ll =Arrays.asList(3, 4,2,5,7);
        System.out.println(ll);

        List<Integer> ul = Collections.unmodifiableList(Arrays.asList(4,3,5,2,7));
        System.out.println(ul);
    }
}
