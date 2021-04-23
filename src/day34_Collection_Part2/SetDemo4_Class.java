package day34_Collection_Part2;

import java.util.*;

public class SetDemo4_Class {

    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(22);
        hs.add(11);
        hs.add(12);
        System.out.println("hash set is: " + hs);

        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(22);
        lhs.add(11);
        lhs.add(12);
        System.out.println("linked hash set is: " + lhs);

        Set<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(22);
        ts.add(11);
        ts.add(12);
        System.out.println("tree set is: " + ts);
    }
}
