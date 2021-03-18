package old_Classes.day5;

public class OperatorsDemo1 {

    public static void main(String[] args) {
        //1. Arithmetic Operators: + - * / %
        System.out.println(7 / 3);//2 It gives quotient
        System.out.println(7 % 3);//1 It gives remainder

        //precedence + - (low) * / % (high)
        //Associativity: left to right

        int a = 3 + 2 - 4 / 2 + 4 * 3 - 7 % 3;
        a = 3 + 2 - 2 + 4 * 3 - 7 % 3;
        a = 3 + 2 - 2 + 12 - 7 % 3;
        a = 3 + 2 - 2 + 12 - 1;
        a = 5 - 2 + 12 - 1;
        a = 3 + 12 - 1;
        a = 15 - 1;
        a = 14;
        System.out.println(a);
    }
}
