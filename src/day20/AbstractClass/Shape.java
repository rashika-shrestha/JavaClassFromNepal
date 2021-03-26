package day20.AbstractClass;

public /*final*/ abstract class Shape {

    //we can not use final, static and private keyword on abstract method
    abstract void draw();

    public void paint() {
        System.out.println("shape is painted...");
    }

    public Shape(){
        System.out.println("shape's constructor...");
    }
}
