package day19.SuperConcept;

public class Parent {

    public Parent(){
        System.out.println("default constructor of parent...");
    }

    public Parent(int a){
        System.out.println("args constructor of parent...");
    }


    String name = "parent's name";

    public void greet() {
        System.out.println("hello from parent...");
    }
}

//private member's
//hidden variable
//overridden method

