package day14_Constructor_thisConcept;

public class ThisDemo2 {

    String name;

    public ThisDemo2(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name is: " + name);
    }

    public static void main(String[] args) {
        ThisDemo2 ob = new ThisDemo2("ram");
        ob.display();
    }

}
