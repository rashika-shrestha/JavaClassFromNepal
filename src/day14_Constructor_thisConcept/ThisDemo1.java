package day14_Constructor_thisConcept;

public class ThisDemo1 {

    //instance variable
    int a = 5;

    //non-static method
    public void display() {
        System.out.println("this is: " + this);
        System.out.println(a);//this.a
        System.out.println(this.a);
        //local variable
        int a = 6;
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        ThisDemo1 ob1 = new ThisDemo1();
        System.out.println("ob1 is: " + ob1);
        ob1.display();
        System.out.println("======================");

        ThisDemo1 ob2 = new ThisDemo1();
        System.out.println("ob2 is: " + ob2);
        ob2.display();

    }
}
