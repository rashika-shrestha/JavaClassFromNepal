package day46_InnerClass;

import java.util.Comparator;

public class Student {

    String name;
    int marks;

    public Student() {

    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return "name= " + name + " marks= " + marks;
    }

    public class StudentMarksComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getMarks() > o2.getMarks()) {
                return 1;
            }
            return -1;
        }
    }
}
