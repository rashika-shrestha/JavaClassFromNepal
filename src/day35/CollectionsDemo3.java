package day35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo3 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(32);
        l.add(13);
        l.add(21);
        System.out.println(l);
        l.add(34);
        System.out.println(l);
        List<Integer> ul = Collections.unmodifiableList(l);
        System.out.println(ul);
//        ul.add(45);
    }
}
