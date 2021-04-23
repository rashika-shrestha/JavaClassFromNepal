package day34;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(12);
        s.add(22);
        s.add(11);
        s.add(14);
        System.out.println(s);
    }
}
