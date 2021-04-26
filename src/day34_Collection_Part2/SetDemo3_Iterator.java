package day34_Collection_Part2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo3_Iterator {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(12);
        s.add(22);
        s.add(11);
        s.add(12);
        System.out.println(s);

        for(int i : s){
            System.out.println(i);
        }

        System.out.println("======");
        Iterator<Integer> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("*************");
        s.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer a) {
                System.out.println(a);
            }
        });

        System.out.println("*************");
        s.forEach(i -> System.out.println(i));
    }
}
