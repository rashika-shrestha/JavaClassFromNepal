package day33_Collection_Part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(15);
        al.add(11);
        System.out.println(al);
        al.add(14);
        System.out.println(al);
        al.add(1, 12);
        System.out.println(al);
        al.set(2, 13);
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.indexOf(13));
        System.out.println(al.contains(14));
        System.out.println(al.size());
//        al.clear();
        System.out.println(al);
        System.out.println(al.isEmpty());

        List<Integer> al2 = new LinkedList<>();
        al2.add(32);
        System.out.println(al2);
//        al2.addAll(al);
        al2.addAll(0, al);
        System.out.println(al2);
//        al2.removeAll(al);
        al2.retainAll(al);
        System.out.println(al2);
    }
}
