package day34;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1_Interface {

    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(100, "raju");
        studentsMap.put(110, "koju");
        studentsMap.put(120, "roju");
        System.out.println(studentsMap);
        System.out.println(studentsMap.get(100));
        System.out.println(studentsMap.containsKey(110));
        System.out.println(studentsMap.containsValue("roju"));
//        studentsMap.clear();
        System.out.println(studentsMap.isEmpty());
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.remove(110));
        System.out.println(studentsMap);
    }
}
