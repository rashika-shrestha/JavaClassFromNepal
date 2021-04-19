package day31_ExceptionHandeling_Part2;

public class ExceptionDemo8ThrowException {

    public static void main(String[] args) {
        vote(8);
        System.out.println("exit");
    }

    public static void vote(int age){
        if(age >= 18){
            System.out.println("you can vote...");
        }else{
            throw new InvalidAgeException("you can not vote...");
        }
    }

}
