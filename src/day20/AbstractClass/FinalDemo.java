package day20.AbstractClass;

//we can not extends(inherit) final class
public /*final*/ class FinalDemo {

    final int a = 6;
//    final int a;

    //we can not override final method
    public /*final*/  void greet(){
        System.out.println("Hello, Good Morning...");
    }

    //we can not use final on constructor
//    public /*final*/ FinalDemo (int a){
//        this.a = a;
//    }

    public FinalDemo (){

    }
}
