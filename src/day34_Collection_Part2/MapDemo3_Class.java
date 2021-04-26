package day34_Collection_Part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3_Class {
    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(100, "raju");
        hashmap.put(110, "koju");
        hashmap.put(120, "roju");

        System.out.println("=== hash map ====");
        for (Map.Entry<Integer, String> student : hashmap.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

        Map<Integer, String> linkedhashmap = new LinkedHashMap<>();
        linkedhashmap.put(100, "raju");
        linkedhashmap.put(110, "koju");
        linkedhashmap.put(120, "roju");

        System.out.println("=== linked hash map ====");
        for (Map.Entry<Integer, String> student : linkedhashmap.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

        Map<Integer, String> treemap = new TreeMap<>();
        treemap.put(100, "raju");
        treemap.put(110, "koju");
        treemap.put(120, "roju");

        System.out.println("=== tree map ====");
        for (Map.Entry<Integer, String> student : treemap.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}
