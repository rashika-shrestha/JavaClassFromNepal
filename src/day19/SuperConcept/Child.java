package day19.SuperConcept;

//super is a keyword and is an implicit reference variable
//of current type and current child object and is
//available inside non-static method and constructor
//of a child class
public class Child extends Parent {

    public Child() {
        super(5);
        System.out.println("child's default constructor");
    }

    public Child(int a) {
//        super();
        System.out.println("child's arg constructor");
    }

    String name = "child's name";

    public void greet() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println("hi from child...");
        super.greet();
    }

    public void sayHi(){
        System.out.println("hi hi hi");
    }
}
