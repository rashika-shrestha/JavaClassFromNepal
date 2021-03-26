package day19.SuperConcept;

public class Test {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.greet();
        c1.sayHi();

        System.out.println("=====================");
        Child c2 = new Child(5);

        System.out.println("++++++++++++++++++++++++++++");
        Parent p1 = new Child();//implicit object casting(up-cast)
        p1.greet();;
//        p1.sayHi();

        Parent p2 = new Parent();
        Child c3 = (Child) p2; //explicit object casting(down-cast)
    }
}
