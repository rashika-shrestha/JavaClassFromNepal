package day34;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2_Iteration {

    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(100, "raju");
        studentsMap.put(110, "koju");
        studentsMap.put(120, "roju");
        System.out.println(studentsMap);

        for (Map.Entry<Integer, String> student : studentsMap.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}
