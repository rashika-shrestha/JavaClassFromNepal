package day35_Array_Collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private int roll;
    private String name;

    public Student(){

    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " " + roll;
    }

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getRoll() > s2.getRoll()) {
            return 1;
        } else {
            return -1;
        }
    }
}
