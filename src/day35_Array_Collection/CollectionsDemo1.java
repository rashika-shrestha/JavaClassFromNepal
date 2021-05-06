package day35_Array_Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo1 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(32);
        l.add(13);
        l.add(21);
        System.out.println(l);
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a > b) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println(l);

    }
}
