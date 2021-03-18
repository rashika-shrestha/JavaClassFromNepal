package old_Classes.day9_IfConcept;

public class NestedIfElseDemo {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;  // if b is 8 then b will be greatest
        int c = 6;

        if (a > b) {
            if (a > c) {
                System.out.println("a is largest one.");
            } else {
                System.out.println("c is largest one.");
            }
        }else{
            System.out.println("a is smaller than b but c may be greater or smaller than a.");
        }
    }
}
