package old_Classes.day9;

public class ElseIfDemo {

    public static void main(String[] args) {

        int marks = 35;

        if (marks >= 80 && marks <= 100) {
            System.out.println("Distinction");
        } else if (marks >= 60 && marks <= 79) {
            System.out.println("First");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Second");
        } else {
            System.out.println("fail");
        }
        System.out.println("more code");
        System.out.println("end");
    }
}

//int n =65;
//char c = (char) n;

//n %2 ==0  to find odd or even number