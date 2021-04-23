package day34_Collection_Part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo2_ArrayList {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(12);
        s.add(22);
        s.add(11);
        s.add(12);
        System.out.println(s);

        System.out.println("================");
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(22);
        l.add(11);
        l.add(12);
        System.out.println(l);

    }
}
