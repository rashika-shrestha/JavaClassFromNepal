package day35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo2 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(32);
        l.add(13);
        l.add(21);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);

    }
}
