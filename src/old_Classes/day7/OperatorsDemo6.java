package old_Classes.day7;

public class OperatorsDemo6 {

    public static void main(String[] args) {
        //Conditional(Ternary) Operator ?:

        int a = 15;
        int b = 6;
        if (a > b) {//true
            System.out.println("a is greater than b.");
        } else {//false
            System.out.println("b is greater than a.");
        }

        String s = (a > b) ? "a is greater than b." : "b is greater than a.";
        System.out.println(s);
    }
}
//ctrl+alt+l