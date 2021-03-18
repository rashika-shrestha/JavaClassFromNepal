package day14_Constructor_thisConcept;

public class Student {

    String name;
    int age;

    public Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("constructor called....");
    }

    public void displayInfo() {
        System.out.println("Name is: " + name);
        System.out.println("age is: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("ram", 22);
        student1.displayInfo();
        System.out.println("==============");
        Student student2 = new Student("shyam", 33);
        student2.displayInfo();

    }
}
