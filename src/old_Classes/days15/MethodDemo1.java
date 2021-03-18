package old_Classes.days15;

public class MethodDemo1 {

    //    <access modifier> void <method name> (zero to any number and any type of args){
//        ==
//        ==
//    }
    public void sayHello() {
        System.out.println("hello from USA");
    }

    public static void displayInfo(String name, int age, double salary) {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }


    public static void main(String[] args) {
        MethodDemo1 ob = new MethodDemo1();
        ob.sayHello();

        String name = "ram";
        int age = 22;
        double salary = 2325.56;
        displayInfo(name, age, salary);
    }
}
