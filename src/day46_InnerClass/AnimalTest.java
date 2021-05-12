package day46_InnerClass;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal(){

            void makeSound(){
                System.out.println("dog barks...");
            }

//            void run(){
//                System.out.println("dog runs...");
//            }
        };
        dog.makeSound();
//        dog.run();
    }
}
