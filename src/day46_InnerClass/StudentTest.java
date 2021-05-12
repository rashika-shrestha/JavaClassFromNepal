package day46_InnerClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ram", 33));
        students.add(new Student("shyam", 53));
        students.add(new Student("hari", 63));
        students.add(new Student("mohan", 23));
        System.out.println(students);
        students.sort(new Student().new StudentMarksComparator());
        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMarks() > o2.getMarks()) {
                    return 1;
                }
                return -1;
            }
        });
        System.out.println(students);
    }
}
