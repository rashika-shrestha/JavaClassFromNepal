package day35;

import java.util.TreeSet;

public class StudentTest {

    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Student());
        ts.add(new Student("ram", 34));
        ts.add(new Student("shyam", 24));
        ts.add(new Student("hari", 54));
        ts.add(new Student("gopal", 14));
        System.out.println(ts);
        System.out.println(ts.last());
        System.out.println(ts.first());
    }
}
