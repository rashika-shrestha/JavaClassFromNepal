package day24_Revision;

//this is available inside non-static method and constructor within a class
//super is available inside non-static method and constructor of a child class
//this and super are used when there is hiding of instance variable by local variable
//of non-static method and constructor
public class Student {

    String name ;
    int roll;

    public Student (){
        String name;
        System.out.println("default constructor....");
    }

    public Student (String name, int roll){
        this.name = name;
        this.roll = roll;
        System.out.println("args constructor....");
    }

    public void greet(){
        System.out.println("hello, good morning...");
    }

    public static void main(String[] args) {
        Student st = new Student("ram", 22);
        st.greet();
        System.out.println("===================");
        Student st2 = new Student();
    }
}
