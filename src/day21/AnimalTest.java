package day21;

import java.util.Scanner;

//run time polymorphism(dynamic binding)
//which can be achieved by overriding of method
public class AnimalTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur choice of animal: ");
        String choice = input.next();
        Animal animal = null;
        switch (choice){
            case "dog":
                animal = new Dog();
                break;
            case "tiger":
                animal = new Tiger();
                break;
            default:
                System.out.println("wrong choice!!!");
                break;
        }

        if(animal!= null){
            animal.makeSound();
        }
    }
}
